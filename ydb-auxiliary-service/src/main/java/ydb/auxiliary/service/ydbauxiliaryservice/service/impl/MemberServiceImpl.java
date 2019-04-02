package ydb.auxiliary.service.ydbauxiliaryservice.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.cluster.OrderLibraryMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.master.MemberMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.master.SysMemberMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.master.SysOperationLogMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.master.SysPrivilegeActionMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.model.*;
import ydb.auxiliary.service.ydbauxiliaryservice.service.MemberService;
import ydb.auxiliary.service.ydbauxiliaryservice.util.CusAccessObjectUtil;
import ydb.auxiliary.service.ydbauxiliaryservice.util.DateUtil;
import ydb.auxiliary.service.ydbauxiliaryservice.util.PageDto;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/11 17:28
 */
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {


    private static final String code = "memberWalletEdit";
    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private SysMemberMapper sysMemberMapper;

    @Autowired
    private SysPrivilegeActionMapper privilegeActionMapper;

    @Autowired
    private SysOperationLogMapper logMapper;

    @Autowired
    private OrderLibraryMapper orderLibraryMapper;


    /**
     * 生成系统日志
     *
     * @param request
     * @param id
     * @param rem
     * @return
     */
    private SysOperationLog createBean(HttpServletRequest request, Long id, String rem) {
        SysOperationLog log = new SysOperationLog();
        log.setIdentity(1);
        log.setActionid(privilegeActionMapper.selectByCode(code).getId().intValue());
        log.setOperatorId(id);
        log.setOperatorTime(new Date());
        log.setOperatorIp(CusAccessObjectUtil.getIpAddress(request));
        log.setRemark(rem);
        return log;
    }

    @Override
    public HashMap<String, Object> querryList(Map<String, Object> maps, Integer pageNum, Integer pageSize) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 15;
        }
        Double price = 0.00;

        //先查出 40天内的未借过充电宝的用户
        List<LibraryDto> libraryDtos = orderLibraryMapper.selectClusterOrder(maps);
        //在查询出余额大于0的用户
        List<WalletDto> walletDtos = memberMapper.listWalletDto(libraryDtos);
        //拼装数据
        List list = new ArrayList<MemberVto>();
        MemberVto members = null;
        for (WalletDto walletDto : walletDtos) {
            for (LibraryDto libraryDto : libraryDtos) {
                //相等的数据
                if (walletDto.getId().equals(libraryDto.getId())) {
                    members = new MemberVto();
                    members.setId(walletDto.getId());
                    members.setMgroup(walletDto.getMgroup());
                    members.setBkTime(libraryDto.getBkTime());
                    members.setOpenid(walletDto.getOpenid());
                    members.setIsblock(walletDto.getIsblock());
                    members.setIswithdraw(walletDto.getIswithdraw());
                    members.setHeadImg(walletDto.getHeadImg());
                    members.setLastBalance(walletDto.getLastBalance());
                    members.setRecodeNum(walletDto.getRecodeNum());
                    members.setRentNum(libraryDto.getRentNum());
                    members.setRegisttime(walletDto.getRegisttime());
                    members.setOrdertime(libraryDto.getOrdertime());
                    members.setTradingtime(walletDto.getTradingtime());
                    members.setNickName(walletDto.getNickName());
                    if (walletDto.getLastBalance() != null) {
                        price = CusAccessObjectUtil.getAdd(price, walletDto.getLastBalance());
                    }
                    list.add(members);
                }
            }
        }
        map.put("totalPrice", price);
        map.put("pageDto", new PageDto(list.size(), pageNum, pageSize));
        if (CollectionUtils.isNotEmpty(list)){
            int star = 0;
            int end = 0;
            if (pageNum>=1 && pageNum<list.size()){
                star = pageNum*pageSize;
            }
            if (pageNum>=list.size() && list.size()!=1){
                star = list.size();
            }
            if (star+pageSize>=list.size()){
                end = list.size();
            }
            if (star+pageSize<list.size()){
                end = star+pageSize;
            }
            map.put("pageInfo", list.subList(star, end));
        }
        return map;
    }

    @Override
    public HashMap<String, Object> findLog(Map<String, Object> map, Integer pageNum, Integer pageSize) throws Exception {
        HashMap<String, Object> maps = new HashMap<String, Object>();
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 15;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<LogVto> vtos = memberMapper.findLogs(map);
        maps.put("pageInfo", new PageInfo<>(vtos));
        return maps;
    }

    @Transactional
    @Override
    public HashMap<String, Object> walletClear(String openIds, HttpServletRequest request, Long id) throws Exception {
        HashMap<String, Object> object = new HashMap<String, Object>();
        String[] strings = openIds.split(",");
        List<Long> longs = new ArrayList<Long>();
        for (int i = 0; i < strings.length; i++) {
            longs.add(Long.valueOf(strings[i]));
        }
        Double price = 0.00;
        object.put("total", "0");
        object.put("code", "-1");
        object.put("num", 0);
        List<MemberVto> memberVtos = memberMapper.findByIds(longs);
        if (CollectionUtils.isNotEmpty(memberVtos)) {
            for (MemberVto vto : memberVtos) {
                price = CusAccessObjectUtil.getAdd(price, vto.getLastBalance());
                vto.setRemark("系统执行用户余额清0:" + "之前金额:" + vto.getLastBalance());
            }
            //余额设置
            object.put("num", memberMapper.updateWalletByPrice(memberVtos));
            object.put("total", price);
            //生成日志系统日志
            SysMember member = sysMemberMapper.selectById(id);
            //**保存
            memberMapper.saveWallLog(memberVtos, member, new Date(), CusAccessObjectUtil.getIpAddress(request));
            object.put("code", "0");
            object.put("msg", "处理成功");
            object.put("date", new Date());
        } else {
            object.put("msg", "没有查询到数据,请重新查询");
        }
        return object;
    }

    @Transactional
    @Override
    public HashMap<String, Object> walletRestoreList(String ids, HttpServletRequest request, Long id) throws Exception {
        String[] strings = ids.split(",");
        List<Long> longs = new ArrayList<Long>();
        for (int i = 0; i < strings.length; i++) {
            longs.add(Long.valueOf(strings[i]));
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", "-1");
        map.put("num", 0);
        map.put("totalPrice", 0.00);
        //查询
        Double price = 0.00;
        List<SysMemberwalletPro> pros = memberMapper.selectByIds(longs);
        if (CollectionUtils.isNotEmpty(pros)) {
            //恢复金额
            for (SysMemberwalletPro memberwalletPro : pros) {
                price = price + memberwalletPro.getBeforeMon();
            }
            int row = memberMapper.restoreWalletList(pros);
            if (row > 0) {
                int i = memberMapper.deleteWallectLogList(pros);
                if (i > 0) {
                    map.put("code", "0");
                    map.put("num", i);
                    map.put("msg", "恢复成功");
                }
            } else {
                map.put("msg", "处理失败");
            }
        } else {
            map.put("msg", "处理失败");
        }
        map.put("totalPrice", price);
        return map;
    }

    @Override
    public HashMap<String, Object> verificationParameter(String days) throws Exception {
        HashMap maps = new HashMap<String, Object>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (StringUtils.isNotEmpty(days)) {
            maps.put("ordertime", DateUtil.getDate(days));
        } else {
            maps.put("ordertime", DateUtil.getDate("40"));
        }
        return maps;
    }

}



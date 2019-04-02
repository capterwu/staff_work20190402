package ydb.auxiliary.service.ydbauxiliaryservice.controller;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ydb.auxiliary.service.ydbauxiliaryservice.model.ResResult;
import ydb.auxiliary.service.ydbauxiliaryservice.service.MemberService;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/11 17:07
 */
@RestController
@RequestMapping("/wallet")
@Slf4j
public class MemberController {


    @Autowired
    private MemberService memberService;


    @PostMapping("/querry")
    ResResult<Object> querry(@RequestParam(value = "days", required = false) String days, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) throws Exception {
        ResResult resResult = null;
        try {
            //验证
            HashMap<String, Object> parameterMaps = memberService.verificationParameter(days);
            HashMap<String, Object> map = memberService.querryList(parameterMaps, pageNum, pageSize);
//            PageInfo pageInfo = (PageInfo) map.get("pageInfo");
//            if (CollectionUtils.isNotEmpty(pageInfo.getList())) {
//                resResult = ResResult.success(map);
//            } else {
//                resResult = ResResult.fail(map);
//            }
            resResult = ResResult.success(map);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.info(ex.getMessage());
            resResult = ResResult.error(ex.getMessage());
        }
        return resResult;
    }


    @PostMapping("/walletClear")
    ResResult<Object> walletClear(HttpServletRequest request, @RequestParam(value = "ids", required = true) String ids, @RequestParam("id") Long id) {
        ResResult resResult = null;
        try {
            HashMap<String, Object> map = memberService.walletClear(ids, request, id);
            if ("0".equals(map.get("code"))) {
                resResult = ResResult.success(map);
            } else {
                resResult = ResResult.fail(map);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            log.info("执行接口{}", ex.getMessage());
            resResult = ResResult.error(ex.getMessage());
        }
        return resResult;
    }


    @PostMapping("/walletRestoreList")
    ResResult<Object> walletRestoreList(@RequestParam("ids") String ids, HttpServletRequest request, @RequestParam("id") Long id) {
        ResResult resResult = null;
        try {
            HashMap map = memberService.walletRestoreList(ids, request, id);
            if ("0".equals(map.get("code"))) {
                resResult = ResResult.success(map);
            } else {
                resResult = ResResult.fail(map);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            log.info(ex.getMessage());
            resResult = ResResult.error(ex.getMessage());
        }
        return resResult;
    }

    @PostMapping("/querryLog")
    ResResult<Object> findLog(@RequestParam(value = "openId", required = false) String openId, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        ResResult resResult = null;
        try {
            HashMap maps = new HashMap<String, Object>();
            if (StringUtils.isNotEmpty(openId)) {
                maps.put("openId", openId);
            } else {
                maps.put("openId", null);
            }
            HashMap map = memberService.findLog(maps, pageNum, pageSize);
            PageInfo pageInfo = (PageInfo) map.get("pageInfo");
            if (CollectionUtils.isNotEmpty(pageInfo.getList())) {
                resResult = ResResult.success(map);
            } else {
                resResult = ResResult.error(map);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            log.info("执行接口出错:" + ex.getMessage());
            resResult = ResResult.error(ex.getMessage());
        }
        return resResult;
    }

}

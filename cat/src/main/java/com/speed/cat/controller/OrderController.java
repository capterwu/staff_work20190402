package com.speed.cat.controller;

import com.alibaba.fastjson.JSON;
import com.speed.cat.model.Member;
import com.speed.cat.model.OrderDivide;
import com.speed.cat.model.Orderinfo;
import com.speed.cat.model.RankShop;
import com.speed.cat.model.vto.Result;
import com.speed.cat.service.OrderService;
import com.speed.cat.service.UserService;
import com.speed.cat.util.CatUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/4 16:55
 */
@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {


    private static int[] equipinfo = {100,
            101,
            102,
            103,
            104,
            105,
            106,
            107,
            108,
            109,
            110,
            111,
            112,
            113,
            114,
            115,
            116,
            117,
            118,
            119
    };

    private static int[] shop = {8950,
            8951,
            8952,
            8953,
            8954,
            8956,
            8957,
            8958,
            8959,
            8960,
            8961,
            8962,
            8963,
            8964,
            8965,
            8966,
            8967,
            8968,
            8969
    };

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;


    @GetMapping("/get")
    public RankShop getS() {
        return orderService.selectById(Long.valueOf(8969));
    }

    @Scheduled(cron = "0 0 0/2 * * ?")
    @GetMapping("/saveOrderInfo")
    @Transactional()
    public Result<Object> saveOrderInfo() {
        log.info("{开始执行=======================开始执行}");
        Result result = null;
        List<Orderinfo> orderinfoList = null;
        List<OrderDivide> orderDivideList = null;
        HashMap map = new HashMap<String, Object>();
        Date s;
        int i = 0;
        try {
            s = new Date();
            List<Member> memberList = userService.getUUName(s);
            if (CollectionUtils.isNotEmpty(memberList)) {
                userService.save(memberList, s);
            } else {
                log.info("生成的用户为空");
            }
            //查询
            List<Member> members = userService.findAll(CatUtil.getfindDate(s));
            orderinfoList = new ArrayList<Orderinfo>();
            orderDivideList = new ArrayList<OrderDivide>();
            if (CollectionUtils.isNotEmpty(members)) {
                for (Member member : members) {
                    Orderinfo dvoorderInfo = orderService.dvoorderInfo(member.getId(), equipinfo, shop, s);
                    orderService.dvoDiv(dvoorderInfo);
                    orderinfoList.add(dvoorderInfo);
                    orderDivideList.add(orderService.dvoDiv(dvoorderInfo));
                }
            } else {
                log.info("查询生成用户为空");
            }
            log.info("orderinfoList:" + JSON.toJSONString(orderinfoList));
            log.info("orderDivideList:" + JSON.toJSONString(orderDivideList));
            //保存
            i = orderService.saveAllOrderinfo(orderinfoList);
            i += orderService.saveAllOrderDivide(orderDivideList);
            map.put("num", i);
            result = Result.success(map);
            log.info("插入的数据:" + result);
        } catch (Exception ex) {
            result = Result.fail(ex.getMessage());
            ex.printStackTrace();
            log.info(ex.getMessage());
            throw new RuntimeException(ex.getMessage());

        }
        log.info("执行结束================================执行结束");
        return result;
    }

}

package com.speed.cat.service.ipml;

import com.alibaba.fastjson.JSON;
import com.speed.cat.dao.OrderDivideMapper;
import com.speed.cat.dao.OrderinfoMapper;
import com.speed.cat.dao.RankShopMapper;
import com.speed.cat.model.*;
import com.speed.cat.service.OrderService;
import com.speed.cat.util.CatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/4 16:08
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderinfoMapper orderinfoMapper;

    @Autowired
    private OrderDivideMapper orderDivideMapper;

    @Autowired
    private RankShopMapper rankShopMapper;


    @Override
    public RankShop selectById(Long id) {
        return rankShopMapper.selectById(id);
    }

    /**
     * 生成实体类
     *
     * @param id
     * @param equ
     * @param shop
     * @return
     */
    @Override
    public Orderinfo dvoorderInfo(Long id, int[] equ, int[] shop, Date s) {
        Orderinfo orderinfo = new Orderinfo();
        orderinfo.setCode(CatUtil.createOrderId());
        orderinfo.setMember(id);
        orderinfo.setEquip((long) CatUtil.random(equ));
        orderinfo.setOrderStatus(2);
        orderinfo.setPayStatus(2);
        orderinfo.setPatType(2);
        orderinfo.setPayCode("2");
        orderinfo.setBwShop((long) CatUtil.random(shop));
        orderinfo.setBkShop(orderinfo.getBwShop());
        orderinfo.setUnitPrice((double) 3.0);
        orderinfo.setPowerBi(CatUtil.generateUID().substring(0, 8));
        orderinfo.setOrdertime(CatUtil.getRandomDate(s));
        orderinfo.setBkTime(CatUtil.getRandomDate(orderinfo.getOrdertime()));
        orderinfo.setUseMinute(CatUtil.dateMethod(orderinfo.getOrdertime(), orderinfo.getBkTime()));
        orderinfo.setBill(15.0);
        log.info("生成Orderinfo实体类:" + JSON.toJSONString(orderinfo));
        return orderinfo;
    }

    @Override
    public OrderDivide dvoDiv(Orderinfo orderinfo) {
        OrderDivide orderDivide = new OrderDivide();
        orderDivide.setBkShop(orderinfo.getBkShop());
        orderDivide.setBwShop(orderinfo.getBkShop());
        orderDivide.setCode(orderinfo.getCode());
        orderDivide.setOrMoney(orderinfo.getBill());
        orderDivide.setBkTime(orderinfo.getBkTime());
        orderDivide.setBrTime(orderinfo.getOrdertime());
        orderDivide.setDiTime(new Date());
        RankShop rankShop = selectById(orderinfo.getBkShop());
        if (rankShop != null) {
            if (rankShop.getPlatExtract() != null) {
                orderDivide.setPlatMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getPlatExtract()));
            }
            if (rankShop.getProvinceExtact() != null) {
                orderDivide.setProvinceMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getProvinceExtact()));
            }
            if (rankShop.getCityExtact() != null) {
                orderDivide.setCityMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getCityExtact()));
            }
            if (rankShop.getAreaExtact() != null) {
                orderDivide.setAreaMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getAreaExtact()));
            }
            if (rankShop.getSalesExtact() != null) {
                orderDivide.setSalesMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getSalesExtact()));
            }
            if (rankShop.getShopExtact() != null) {
                orderDivide.setShopMoney(CatUtil.numberFormat(orderDivide.getOrMoney(), rankShop.getShopExtact()));
            }
        }
        orderDivide.setIsblock(1);
        log.info("生成orderDivide实体类:" + JSON.toJSONString(orderDivide));
        return orderDivide;
    }

    @Override
    public int saveAllOrderinfo(List<Orderinfo> orderinfos) {
        return orderinfoMapper.save(orderinfos);
    }

    @Override
    public int saveAllOrderDivide(List<OrderDivide> orderDivides) {
        return orderDivideMapper.save(orderDivides);
    }


}

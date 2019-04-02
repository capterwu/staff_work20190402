package com.speed.cat.service;

import com.speed.cat.model.OrderDivide;
import com.speed.cat.model.Orderinfo;
import com.speed.cat.model.RankShop;

import java.util.Date;
import java.util.List;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/4 15:55
 */
public interface OrderService {


    RankShop selectById(Long id);

    Orderinfo dvoorderInfo(Long id, int[] equ, int[] shop, Date s);

    OrderDivide dvoDiv(Orderinfo orderinfo);

    int saveAllOrderinfo(List<Orderinfo> orderinfos);

    int saveAllOrderDivide(List<OrderDivide> orderDivides);

}

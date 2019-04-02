package com.speed.cat.dao;

import com.speed.cat.model.Orderinfo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderinfoMapper {

    @Insert({
            "<script>",
            "insert into orderinfo (MEMBER,EQUIP,CODE,ORDER_STATUS,PAY_STATUS,PAT_TYPE,PAY_CODE,POWER_BI,BW_SHOP,BK_SHOP,USE_MINUTE,BILL,UNIT_PRICE,ORDERTIME,BK_TIME) values",
            "<foreach collection='orderinfos' item='item' index='index' separator=','>",
            "(#{item.member},#{item.equip},#{item.code},#{item.orderStatus},#{item.payStatus},#{item.patType},#{item.payCode},#{item.powerBi},#{item.bwShop},#{item.bkShop}, #{item.useMinute},#{item.bill},#{item.unitPrice}, #{item.ordertime},#{item.bkTime})",
            "</foreach>",
            "</script>"
    })
    int save(@Param("orderinfos") List<Orderinfo> orderinfos);
}
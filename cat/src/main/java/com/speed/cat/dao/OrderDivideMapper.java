package com.speed.cat.dao;

import com.speed.cat.model.OrderDivide;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDivideMapper {
    @Insert({
            "<script>",
            "insert into order_divide (BW_SHOP, BK_SHOP, CODE, OR_MONEY, BK_TIME, BR_TIME, DI_TIME, PLAT_MONEY, PROVINCE_MONEY, CITY_MONEY, AREA_MONEY, SALES_MONEY, SHOP_MONEY, ISBLOCK) values",
            "<foreach collection='orderDivides' item='item' index='index' separator=','>",
            "(#{item.bwShop},#{item.bkShop},#{item.code},#{item.orMoney}, #{item.bkTime},#{item.brTime},#{item.diTime}, #{item.platMoney},#{item.provinceMoney},#{item.cityMoney}, #{item.areaMoney},#{item.salesMoney},#{item.shopMoney},#{item.isblock})",
            "</foreach>",
            "</script>"
    })
    int save(@Param("orderDivides") List<OrderDivide> orderDivides);

}
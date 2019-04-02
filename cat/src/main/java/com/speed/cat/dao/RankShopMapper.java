package com.speed.cat.dao;

import com.speed.cat.model.RankShop;
import com.speed.cat.model.RankShopExample;
import com.speed.cat.model.RankShopWithBLOBs;

import java.util.List;

import com.speed.cat.model.ShopMap;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RankShopMapper {

    /**
     * 通过店铺编码查询
     *
     * @param id
     * @return
     */
    @Select("SELECT ran.PLAT_EXTRACT AS platExtract,ran.PROVINCE_EXTACT AS provinceExtact,ran.CITY_EXTACT AS cityExtact,ran.AREA_EXTACT AS areaExtact,ran.SALES_EXTACT AS salesExtact,ran.SHOP_EXTACT AS shopExtact FROM rank_shop AS ran WHERE ran.ID=#{id}")
    RankShop selectById(Long id);


}
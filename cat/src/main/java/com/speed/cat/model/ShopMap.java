package com.speed.cat.model;

import java.io.Serializable;
import java.util.Date;

public class ShopMap implements Serializable {
    private Integer id;

    private Long shopid;

    private String shopcode;

    private Long areaid;

    private String shopname;

    private String shopaddress;

    private Integer equipcount;

    private String shopcoordinate;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public String getShopcode() {
        return shopcode;
    }

    public void setShopcode(String shopcode) {
        this.shopcode = shopcode;
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public Integer getEquipcount() {
        return equipcount;
    }

    public void setEquipcount(Integer equipcount) {
        this.equipcount = equipcount;
    }

    public String getShopcoordinate() {
        return shopcoordinate;
    }

    public void setShopcoordinate(String shopcoordinate) {
        this.shopcoordinate = shopcoordinate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
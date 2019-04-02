package com.speed.cat.model;

import java.io.Serializable;
import java.util.Date;

public class OrderDivide implements Serializable {
    private Long id;

    private Long bwShop;

    private Long bkShop;

    private String code;

    private Double orMoney;

    private Date bkTime;

    private Date brTime;

    private Date diTime;

    private Double platMoney;

    private Double provinceMoney;

    private Double cityMoney;

    private Double areaMoney;

    private Double salesMoney;

    private Double shopMoney;

    private Integer isblock;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBwShop() {
        return bwShop;
    }

    public void setBwShop(Long bwShop) {
        this.bwShop = bwShop;
    }

    public Long getBkShop() {
        return bkShop;
    }

    public void setBkShop(Long bkShop) {
        this.bkShop = bkShop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getOrMoney() {
        return orMoney;
    }

    public void setOrMoney(Double orMoney) {
        this.orMoney = orMoney;
    }

    public Date getBkTime() {
        return bkTime;
    }

    public void setBkTime(Date bkTime) {
        this.bkTime = bkTime;
    }

    public Date getBrTime() {
        return brTime;
    }

    public void setBrTime(Date brTime) {
        this.brTime = brTime;
    }

    public Date getDiTime() {
        return diTime;
    }

    public void setDiTime(Date diTime) {
        this.diTime = diTime;
    }

    public Double getPlatMoney() {
        return platMoney;
    }

    public void setPlatMoney(Double platMoney) {
        this.platMoney = platMoney;
    }

    public Double getProvinceMoney() {
        return provinceMoney;
    }

    public void setProvinceMoney(Double provinceMoney) {
        this.provinceMoney = provinceMoney;
    }

    public Double getCityMoney() {
        return cityMoney;
    }

    public void setCityMoney(Double cityMoney) {
        this.cityMoney = cityMoney;
    }

    public Double getAreaMoney() {
        return areaMoney;
    }

    public void setAreaMoney(Double areaMoney) {
        this.areaMoney = areaMoney;
    }

    public Double getSalesMoney() {
        return salesMoney;
    }

    public void setSalesMoney(Double salesMoney) {
        this.salesMoney = salesMoney;
    }

    public Double getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(Double shopMoney) {
        this.shopMoney = shopMoney;
    }

    public Integer getIsblock() {
        return isblock;
    }

    public void setIsblock(Integer isblock) {
        this.isblock = isblock;
    }
}
package com.speed.cat.model;

import java.io.Serializable;
import java.util.Date;

public class Orderinfo implements Serializable {
    private Long id;

    private Long member;

    private Long equip;

    private String code;

    private Integer orderStatus;

    private Integer payStatus;

    private Integer patType;

    private String payCode;

    private String powerBi;

    private Long bwShop;

    private Long bkShop;

    private Integer useMinute;

    private Double bill;

    private Double unitPrice;

    private Date ordertime;

    private Date bkTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getEquip() {
        return equip;
    }

    public void setEquip(Long equip) {
        this.equip = equip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPatType() {
        return patType;
    }

    public void setPatType(Integer patType) {
        this.patType = patType;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPowerBi() {
        return powerBi;
    }

    public void setPowerBi(String powerBi) {
        this.powerBi = powerBi;
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

    public Integer getUseMinute() {
        return useMinute;
    }

    public void setUseMinute(Integer useMinute) {
        this.useMinute = useMinute;
    }

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getBkTime() {
        return bkTime;
    }

    public void setBkTime(Date bkTime) {
        this.bkTime = bkTime;
    }
}
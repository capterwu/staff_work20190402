package ydb.auxiliary.service.ydbauxiliaryservice.model;

import java.io.Serializable;
import java.util.Date;

public class OrderLibrary implements Serializable {
    private Long id;

    private String code;

    private String mOpenid;

    private Integer mType;

    private Integer sex;

    private Date registtime;

    private Date ordertime;

    private String equipCode;

    private Integer orderStatus;

    private Integer payStatus;

    private Integer payType;

    private String payCode;

    private String powerBi;

    private String bwShop;

    private String bkShop;

    private Date bkTime;

    private Integer useMinute;

    private Double bill;

    private Double unitPrice;

    private Integer freeUsetime;

    private Double highCost;

    private String platOid;

    private String platName;

    private Integer platExtract;

    private String provinceOid;

    private String provinceName;

    private Integer provinceExtact;

    private String cityOid;

    private String cityName;

    private Integer cityExtact;

    private String areaOid;

    private String areaName;

    private Integer areaExtact;

    private String salesOid;

    private String salesName;

    private Integer salesExtact;

    private String shopOid;

    private String shopName;

    private Integer shopExtact;

    private Double shopProfitMoney;

    private Date diTime;

    private Long bwSid;

    private String bwScode;

    private Long bkSid;

    private String bkScode;

    private Double platMoney;

    private Double provinceMoney;

    private Double cityMoney;

    private Double areaMoney;

    private Double salesMoney;

    private Double shopMoney;

    private String nickName;

    private String headImg;

    private Long equipTypeId;

    private String equipTypeCode;

    private String equipTypeName;

    private Integer equipTypeCardnum;

    private Integer equipTypeVersion;

    private Date updatetime;

    private Long mId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getmOpenid() {
        return mOpenid;
    }

    public void setmOpenid(String mOpenid) {
        this.mOpenid = mOpenid;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getEquipCode() {
        return equipCode;
    }

    public void setEquipCode(String equipCode) {
        this.equipCode = equipCode;
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

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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

    public String getBwShop() {
        return bwShop;
    }

    public void setBwShop(String bwShop) {
        this.bwShop = bwShop;
    }

    public String getBkShop() {
        return bkShop;
    }

    public void setBkShop(String bkShop) {
        this.bkShop = bkShop;
    }

    public Date getBkTime() {
        return bkTime;
    }

    public void setBkTime(Date bkTime) {
        this.bkTime = bkTime;
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

    public Integer getFreeUsetime() {
        return freeUsetime;
    }

    public void setFreeUsetime(Integer freeUsetime) {
        this.freeUsetime = freeUsetime;
    }

    public Double getHighCost() {
        return highCost;
    }

    public void setHighCost(Double highCost) {
        this.highCost = highCost;
    }

    public String getPlatOid() {
        return platOid;
    }

    public void setPlatOid(String platOid) {
        this.platOid = platOid;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public Integer getPlatExtract() {
        return platExtract;
    }

    public void setPlatExtract(Integer platExtract) {
        this.platExtract = platExtract;
    }

    public String getProvinceOid() {
        return provinceOid;
    }

    public void setProvinceOid(String provinceOid) {
        this.provinceOid = provinceOid;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProvinceExtact() {
        return provinceExtact;
    }

    public void setProvinceExtact(Integer provinceExtact) {
        this.provinceExtact = provinceExtact;
    }

    public String getCityOid() {
        return cityOid;
    }

    public void setCityOid(String cityOid) {
        this.cityOid = cityOid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityExtact() {
        return cityExtact;
    }

    public void setCityExtact(Integer cityExtact) {
        this.cityExtact = cityExtact;
    }

    public String getAreaOid() {
        return areaOid;
    }

    public void setAreaOid(String areaOid) {
        this.areaOid = areaOid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaExtact() {
        return areaExtact;
    }

    public void setAreaExtact(Integer areaExtact) {
        this.areaExtact = areaExtact;
    }

    public String getSalesOid() {
        return salesOid;
    }

    public void setSalesOid(String salesOid) {
        this.salesOid = salesOid;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Integer getSalesExtact() {
        return salesExtact;
    }

    public void setSalesExtact(Integer salesExtact) {
        this.salesExtact = salesExtact;
    }

    public String getShopOid() {
        return shopOid;
    }

    public void setShopOid(String shopOid) {
        this.shopOid = shopOid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopExtact() {
        return shopExtact;
    }

    public void setShopExtact(Integer shopExtact) {
        this.shopExtact = shopExtact;
    }

    public Double getShopProfitMoney() {
        return shopProfitMoney;
    }

    public void setShopProfitMoney(Double shopProfitMoney) {
        this.shopProfitMoney = shopProfitMoney;
    }

    public Date getDiTime() {
        return diTime;
    }

    public void setDiTime(Date diTime) {
        this.diTime = diTime;
    }

    public Long getBwSid() {
        return bwSid;
    }

    public void setBwSid(Long bwSid) {
        this.bwSid = bwSid;
    }

    public String getBwScode() {
        return bwScode;
    }

    public void setBwScode(String bwScode) {
        this.bwScode = bwScode;
    }

    public Long getBkSid() {
        return bkSid;
    }

    public void setBkSid(Long bkSid) {
        this.bkSid = bkSid;
    }

    public String getBkScode() {
        return bkScode;
    }

    public void setBkScode(String bkScode) {
        this.bkScode = bkScode;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Long getEquipTypeId() {
        return equipTypeId;
    }

    public void setEquipTypeId(Long equipTypeId) {
        this.equipTypeId = equipTypeId;
    }

    public String getEquipTypeCode() {
        return equipTypeCode;
    }

    public void setEquipTypeCode(String equipTypeCode) {
        this.equipTypeCode = equipTypeCode;
    }

    public String getEquipTypeName() {
        return equipTypeName;
    }

    public void setEquipTypeName(String equipTypeName) {
        this.equipTypeName = equipTypeName;
    }

    public Integer getEquipTypeCardnum() {
        return equipTypeCardnum;
    }

    public void setEquipTypeCardnum(Integer equipTypeCardnum) {
        this.equipTypeCardnum = equipTypeCardnum;
    }

    public Integer getEquipTypeVersion() {
        return equipTypeVersion;
    }

    public void setEquipTypeVersion(Integer equipTypeVersion) {
        this.equipTypeVersion = equipTypeVersion;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }
}
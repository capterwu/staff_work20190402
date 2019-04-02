package com.speed.cat.model;

import java.io.Serializable;

public class RankShopWithBLOBs extends RankShop implements Serializable {
    private String shopBanner;

    private String shopLicence;

    private String shopAgreement;

    private static final long serialVersionUID = 1L;

    public String getShopBanner() {
        return shopBanner;
    }

    public void setShopBanner(String shopBanner) {
        this.shopBanner = shopBanner;
    }

    public String getShopLicence() {
        return shopLicence;
    }

    public void setShopLicence(String shopLicence) {
        this.shopLicence = shopLicence;
    }

    public String getShopAgreement() {
        return shopAgreement;
    }

    public void setShopAgreement(String shopAgreement) {
        this.shopAgreement = shopAgreement;
    }
}
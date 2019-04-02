package com.speed.cat.model;

import java.io.Serializable;

public class Equipinfo implements Serializable {
    private Long id;

    private String code;

    private Long type;

    private Long server;

    private Integer state;

    private Integer isstock;

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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getServer() {
        return server;
    }

    public void setServer(Long server) {
        this.server = server;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsstock() {
        return isstock;
    }

    public void setIsstock(Integer isstock) {
        this.isstock = isstock;
    }
}
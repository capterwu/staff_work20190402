package ydb.auxiliary.service.ydbauxiliaryservice.model;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Long id;

    private String openid;

    private String nickName;

    private String headImg;

    private Integer mType;

    private Integer mGroup;

    private Integer isreceive;

    private Integer iswithdraw;

    private Integer isblock;

    private Date registtime;

    private Integer sex;

    private String openidMp;

    private String unionid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public Integer getmGroup() {
        return mGroup;
    }

    public void setmGroup(Integer mGroup) {
        this.mGroup = mGroup;
    }

    public Integer getIsreceive() {
        return isreceive;
    }

    public void setIsreceive(Integer isreceive) {
        this.isreceive = isreceive;
    }

    public Integer getIswithdraw() {
        return iswithdraw;
    }

    public void setIswithdraw(Integer iswithdraw) {
        this.iswithdraw = iswithdraw;
    }

    public Integer getIsblock() {
        return isblock;
    }

    public void setIsblock(Integer isblock) {
        this.isblock = isblock;
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOpenidMp() {
        return openidMp;
    }

    public void setOpenidMp(String openidMp) {
        this.openidMp = openidMp;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
package ydb.auxiliary.service.ydbauxiliaryservice.model;

import java.io.Serializable;
import java.util.Date;

public class SysMemberwalletPro implements Serializable {
    private Long id;

    private Long member;

    private Double beforeMon;

    private Date processTime;

    private Long operatorId;

    private String remark;

    private String operatorIp;

    private String accountName;

    private String realName;

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

    public Double getBeforeMon() {
        return beforeMon;
    }

    public void setBeforeMon(Double beforeMon) {
        this.beforeMon = beforeMon;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
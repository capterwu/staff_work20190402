package ydb.auxiliary.service.ydbauxiliaryservice.model;

import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/20 16:05
 */
@Data
public class LogVto {

    private Long id;
    private String remark;
    private String openid;
    private String headImg;
    private String nickName;
    private String processTime;
    private String operatorIp;
    private String accountName;
    private Double beforeMon;
    private String mtype;
}

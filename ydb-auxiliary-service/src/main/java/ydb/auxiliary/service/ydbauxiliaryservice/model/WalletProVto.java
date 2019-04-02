package ydb.auxiliary.service.ydbauxiliaryservice.model;

import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/13 18:07
 */
@Data
public class WalletProVto {


    private Long id;
    private String remark;
    private String operatorId;
    private String operatorIp;
    private String accountName;
    private String realName;
}

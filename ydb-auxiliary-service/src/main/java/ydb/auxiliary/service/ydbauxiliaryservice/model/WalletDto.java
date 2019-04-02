package ydb.auxiliary.service.ydbauxiliaryservice.model;

import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/26 11:09
 */
@Data
public class WalletDto {

    private Long id;
    private String openid;
    private String headImg;
    private Integer mgroup;
    private String tradingtime;
    private int recodeNum;
    private int iswithdraw;
    private int isblock;
    private Double lastBalance;
    private String registtime;
    private String nickName;
}

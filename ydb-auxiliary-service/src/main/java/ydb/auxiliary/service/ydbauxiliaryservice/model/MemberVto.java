package ydb.auxiliary.service.ydbauxiliaryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/13 17:42
 */
@Data
public class MemberVto {

    private Long id;
    private Double lastBalance;
    private String remark;
    private int iswithdraw;
    private int isblock;
    private String openid;
    private String headImg;
    private Integer mgroup;
    private String registtime;
    private String bkTime;
    private String ordertime;
    private String nickName;
    private int rentNum;
    private String tradingtime;
    private int recodeNum;


}

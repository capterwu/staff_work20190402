package ydb.auxiliary.service.ydbauxiliaryservice.model;

import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/26 11:26
 */
@Data
public class LibraryDto {


    private Long id;
    private String bkTime;
    private String ordertime;
    private int rentNum;

}


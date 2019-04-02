package ydb.auxiliary.service.ydbauxiliaryservice.model;


import lombok.Data;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/11 16:17
 */
@Data

public class ResResult<T> {


    private String code;
    private String msg;
    private String timestamp;
    private T data;


    public static ResResult error(Object o) {
        ResResult resResult = new ResResult<>();
        resResult.setCode(ReqCode.ERROR.getCode());
        resResult.setMsg(ReqCode.ERROR.getMsg());
        resResult.setTimestamp(String.valueOf(System.currentTimeMillis()));
        resResult.setData(o);
        return resResult;
    }


    public static ResResult success(Object o) {
        ResResult resResult = new ResResult<>();
        resResult.setData(o);
        resResult.setTimestamp(String.valueOf(System.currentTimeMillis()));
        resResult.setCode(ReqCode.SUSSESS.getCode());
        resResult.setMsg(ReqCode.SUSSESS.getMsg());
        return resResult;
    }

    public static ResResult fail(Object o) {
        ResResult resResult = new ResResult<>();
        resResult.setCode(ReqCode.FAIL.getCode());
        resResult.setTimestamp(String.valueOf(System.currentTimeMillis()));
        resResult.setMsg(ReqCode.FAIL.getMsg());
        resResult.setData(o);
        return resResult;

    }
}

package ydb.auxiliary.service.ydbauxiliaryservice.model;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/8 16:15
 */

public enum ReqCode {


    SUSSESS("0", "请求成功"),
    FAIL("-1", "获取失败"),
    ERROR("-9999", "系统内部异常，请联系管理员");


    private String code;
    private String msg;

    ReqCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

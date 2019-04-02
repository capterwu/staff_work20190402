package com.speed.cat.model.vto;

import lombok.Data;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/4 11:58
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;


    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(String msg) {
        if (msg == null) {
            return;
        }
        this.code = -1;
        this.msg = msg;
    }


    /**
     * 成功时
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }


    /**
     * 失败
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(String mg) {
        return new Result<T>(mg);
    }


}

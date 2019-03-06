package com.tjhq.business.vuedemo;

/**
 * @author ：zhengqiao
 * @description：开发响应结果对象代码
 * 统一 API响应结果封装
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @date ：Created in 2019/2/20 15:00
 */
public class Result {

    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应提示信息
     */
    private String message;
    /**
     * 响应结果对象
     */
    private Object data;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

package com.tjhq.business.vuedemo;

/**
 * @author ：zhengqiao
 * @description：响应结果生成工厂类
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @date ：Created in 2019/2/20 15:03
 */
public class ResultFactory {
    public static Result buildSuccessResult(Object data) {
        return buidResult(ResultCode.SUCCESS, "成功", data);
    }

    public static Result buildFailResult(String message) {
        return buidResult(ResultCode.FAIL, message, null);
    }

    public static Result buidResult(ResultCode resultCode, String message, Object data) {
        return buidResult(resultCode.code, message, data);
    }

    public static Result buidResult(int resultCode, String message, Object data) {
        return new Result(resultCode, message, data);
    }
}

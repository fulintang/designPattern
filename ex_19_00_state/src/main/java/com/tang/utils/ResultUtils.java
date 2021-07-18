package com.tang.utils;

import com.tang.vo.Result;

public class ResultUtils {

    public static Result<Object> OK() {
        return new Result<Object>(0, "success");
    }

    public static <T> Result<T> OK(T data) {
        return new Result<T>(0, "success", data);
    }

    public static Result<Object> ERROR() {
        return new Result<Object>(101, "变更状态拒绝");
    }
}

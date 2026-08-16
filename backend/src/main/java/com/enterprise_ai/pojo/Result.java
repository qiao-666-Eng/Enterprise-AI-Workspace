package com.enterprise_ai.pojo;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Result <T> {
    private Integer code;
    private String message;
    private T data;

    //快速返回操作成功响应的结果（需要响应数据）
    public static <E> Result success(E data) {
        return new Result<>(0, "操作成功 ", data);
    }

    public static Result success() {
        return new Result(0, "操作成功 ", null);
    }

    public static Result fail() {
        return new Result(1, "操作失败 ", null);
    }
}


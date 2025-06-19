package com.goktech.ops.sys.entity.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R<T> {
    private String code;
    private String msg;
    private T data;

    public R(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> R<T> success(T data) {
        return new R<>("0", "SUCCESS", data);
    }

    public static <T> R<T> fail(String msg) {
        return new R<>("1", msg, null);
    }
}
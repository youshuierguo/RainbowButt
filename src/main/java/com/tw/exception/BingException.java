package com.tw.exception;

public class BingException {
    private final int code;

    public BingException(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.toString();
    }

    public String toString() {
        return "系统异常，异常编码：" + this.code;
    }
}

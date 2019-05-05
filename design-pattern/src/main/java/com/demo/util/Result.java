package com.demo.util;

public class Result {

    public static final int SUCCESS = 0;
    public static final int FAIL = -1;

    private int code;
    private String msg;
    private Object data;

    public Result() {
    }


    public static Result getResult(int code, String msg) {
        return new Result(code, msg, null);
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

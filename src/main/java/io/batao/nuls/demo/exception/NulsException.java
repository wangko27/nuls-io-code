package io.batao.nuls.demo.exception;


import io.batao.nuls.demo.ErrorCode;

public class NulsException extends Exception {

    private String code;

    private String msg;

    public NulsException() {

    }

    public NulsException(Exception e) {
        super(e);
    }

    public NulsException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public NulsException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public NulsException(ErrorCode errorCode, Exception e) {
        super(e);
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

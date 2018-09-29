package io.batao.nuls.demo.exception;


import io.batao.nuls.demo.ErrorCode;

public class NulsRuntimeException extends RuntimeException {

    private String code;

    private String msg;

    public NulsRuntimeException(Exception e) {
        super(e);
    }

    public NulsRuntimeException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public NulsRuntimeException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }


    public NulsRuntimeException(ErrorCode errorCode, String msg) {
        this.code = errorCode.getCode();
        this.msg = msg;
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

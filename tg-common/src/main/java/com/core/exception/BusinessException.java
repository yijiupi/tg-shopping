package com.core.exception;

import com.core.common.enums.ErrorCode;
/**
 * 业务异常类
 * @author Administrator
 *
 */
public class BusinessException extends RuntimeException {
    /**
     * 默认序列号
     */
    private static final long serialVersionUID = 1L;
    
    
    /**
     * 获取序列码出错
     */
    public static final BusinessException DB_GET_SEQ_NEXT_VALUE_ERROR = new BusinessException(ErrorCode.ERROR_SEQ_FAILED, "获取序列出错");
    
    /**
     * 对象序列化/反序列化失败
     */
    public static final BusinessException SERIALIZE_ERROR = new BusinessException(ErrorCode.ERROR_SERIALIZE_FAILED, "对象序列化/反序列化失败");
    
    /**
     * 调用接口失败
     */
    public static final BusinessException CALLAPI_ERROR = new BusinessException(ErrorCode.ERROR_CALLAPI_FAILED, "调用接口失败");
    /**
     * 错误码
     */
    protected ErrorCode errorCode;
    /**
     * 异常消息
     */
    protected String msg;
    
    /**
     * 构造器
     * @param errorCode
     * @param format
     * @param args
     */
    public BusinessException(ErrorCode errorCode, String format, Object...args) {
        this(null, errorCode, format, args);
    }
    
    /**
     * 构造器
     * @param cause
     * @param errorCode
     * @param format
     * @param args
     */
    public BusinessException(Throwable cause, ErrorCode errorCode, String format, Object...args) {
        this(String.format(format, args), cause);
        
        this.errorCode = errorCode;
        this.msg = String.format(format, args);
    }
    
    /**
     * 构造器
     * 
     * @param message
     * @param cause
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * 实例化异常
     * 
     * @param cause
     * @param msgFormat
     * @param args
     * @return
     */
    public BusinessException newInstance(Throwable cause, String msgFormat, Object... args) {
        return new BusinessException(cause, this.errorCode, msgFormat, args);
    }
    
    /**
     * 实例化异常
     * 
     * @param msgFormat
     * @param args
     * @return
     */
    public BusinessException newInstance(String msgFormat, Object... args) {
        return new BusinessException(this.errorCode, msgFormat, args);
    }

    /**
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param errorCode the errorCode to set
     */
    protected void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @param msg the msg to set
     */
    protected void setMsg(String msg) {
        this.msg = msg;
    }  
    
    
}

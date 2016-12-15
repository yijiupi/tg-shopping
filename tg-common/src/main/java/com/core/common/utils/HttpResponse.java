/**
 * HttpResponse.java
 */
package com.core.common.utils;

import java.util.List;
import java.util.Map;

/**
 * http响应 
 * @author Administrator
 *
 */
public class HttpResponse {
    /**
     * 响应对应的请求
     */
    HttpRequest request;
    /**
     * http状态码
     */
    private int statusCode;
    /**
     * 返回内容
     */
    private String content;
    /**
     * 错误消息
     */
    private String errorMessage;
    /**
     * 异常
     */
    private Exception exception;
    /**
     * 内容类型
     */
    private String contentType;
    /**
     * 响应头
     */
    private Map<String, List<String>> headers;
    
    /**
     * 构造器
     * @param statusCode
     */
    public HttpResponse(int statusCode) {
        this.statusCode = statusCode;
    }
    
    /**
     * 构造器
     * @param statusCode
     * @param content
     */
    public HttpResponse(int statusCode, String content) {
        this.statusCode = statusCode;
        this.content = content;
    }
    
    /**
     * 构造器
     * @param e
     */
    public HttpResponse(Exception e){
        if(e==null){
            throw new IllegalArgumentException("exception must be specified");
        }
        this.statusCode = -1;
        this.exception = e;
    }
    /**
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }
    /**
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }
    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * @return the exception
     */
    public Exception getException() {
        return exception;
    }
    /**
     * @param exception the exception to set
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }
    /**
     * @return the contentType
     */
    public String getContentType() {
        return contentType;
    }
    /**
     * @param contentType the contentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    /**
     * @return the headers
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }
    /**
     * @param headers the headers to set
     */
    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess(){
        return statusCode==200;
    }

    /**
     * @return the request
     */
    public HttpRequest getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(HttpRequest request) {
        this.request = request;
    }
    
    
}

/**
 * Request.java
 */
package com.core.common.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * http请求 
 * @author Administrator
 *
 */
public class HttpRequest {
    /**
     * content type
     */
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_MULTIPART = "multipart/form-data";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_XML = "text/xml";

    /**
     * 请求url地址
     */
    private String url;

    /**
     * 请求方法
     */
    private String method = HttpClientUtils.HTTP_METHOD_GET;

    /**
     * 字符集
     */
    private String charset = HttpClientUtils.DEFAULT_CHARSET;

    /**
     * 连接超时时间
     */
    private int connectTimeout = HttpClientUtils.DEFAULT_CONNECT_TIMEOUT;

    /**
     * 读取超时时间
     */
    private int readTimeout = HttpClientUtils.DEFAULT_READ_TIMEOUT;

    /**
     * 请求头
     */
    private Map<String, Object> headers = new LinkedHashMap<>();

    /**
     * 请求参数
     */
    private Map<String, Object> parameters = new LinkedHashMap<>();

    /**
     * 当请求参数为空且post时有效
     */
    private String postData;
    
    /**
     * TAG
     */
    private Object tag;
    
    /**
     * 客户端key文件p12路径
     */
    private String clientKeyStorePath;
    /**
     * 客户端keystore加载密码
     */
    private String clientKeyStorePass;
    /**
     * 客户端keystore私钥密码
     */
    private String privateKeyPass;
    
    /**
     * 授信keystore
     */
    private String trustKeyStorePath;
    
    /**
     * 授信keystore密码
     */
    private String trustKeyStorePass;
    
    /**
     * keystore类型,默认jks
     */
    private String keyStoreType;
    
    /**
     * ssl协议，默认TLS
     */
    private String sslProtocol;
    
    /**
     * 是否验证ssl的主机名
     */
    private boolean hostnameVerify = true;
    

    /**
     * 构造器
     * @param url
     */
    public HttpRequest(String url) {
        this.url = url;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     *            the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the charset
     */
    public String getCharset() {
        return charset;
    }

    /**
     * @param charset
     *            the charset to set
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * @return the connectTimeout
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * @param connectTimeout
     *            the connectTimeout to set
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * @return the readTimeout
     */
    public int getReadTimeout() {
        return readTimeout;
    }

    /**
     * @param readTimeout
     *            the readTimeout to set
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * @return the postData
     */
    public String getPostData() {
        return postData;
    }

    /**
     * @param postData
     *            the postData to set
     */
    public void setPostData(String postData) {
        this.postData = postData;
    }

    /**
     * @return the headers
     */
    public Map<String, Object> getHeaders() {
        return headers;
    }

    /**
     * @return the parameters
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * 添加请求头，如果已存在，则覆盖
     * @param key
     * @param value
     */
    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    /**
     * 添加请求头，如果已存在，则覆盖
     * @param key
     * @param values
     */
    public void addHeaders(String key, Collection<String> values) {
        this.headers.put(key, values);
    }

    /**
     * 设置请求头，会覆盖已存在的项
     * @param headers
     */
    public void setHeaders(Map<String, ?> headers) {
        this.headers.putAll(headers);
    }

    /**
     * 添加请求参数，如果已存在，则覆盖
     * @param key
     * @param value
     */
    public void addParameter(String key, String value) {
        this.parameters.put(key, value);
    }

    /**
     * 添加请求参数，如果已存在，则覆盖
     * @param key
     * @param values
     */
    public void addParameters(String key, Collection<String> values) {
        this.parameters.put(key, values);
    }

    /**
     * 设置请求参数，会覆盖已存在的项
     * @param parameters
     */
    public void setParameters(Map<String, ?> parameters) {
        this.parameters.putAll(parameters);
    }

    /**
     * @return the tag
     */
    public Object getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(Object tag) {
        this.tag = tag;
    }

    /**
     * @return the clientKeyStorePath
     */
    public String getClientKeyStorePath() {
        return clientKeyStorePath;
    }

    /**
     * @param clientKeyStorePath the clientKeyStorePath to set
     */
    public void setClientKeyStorePath(String clientKeyStorePath) {
        this.clientKeyStorePath = clientKeyStorePath;
    }

    /**
     * @return the clientKeyStorePass
     */
    public String getClientKeyStorePass() {
        return clientKeyStorePass;
    }

    /**
     * @param clientKeyStorePass the clientKeyStorePass to set
     */
    public void setClientKeyStorePass(String clientKeyStorePass) {
        this.clientKeyStorePass = clientKeyStorePass;
    }

    /**
     * @return the privateKeyPass
     */
    public String getPrivateKeyPass() {
        return privateKeyPass;
    }

    /**
     * @param privateKeyPass the privateKeyPass to set
     */
    public void setPrivateKeyPass(String privateKeyPass) {
        this.privateKeyPass = privateKeyPass;
    }

    /**
     * @return the trustKeyStorePath
     */
    public String getTrustKeyStorePath() {
        return trustKeyStorePath;
    }

    /**
     * @param trustKeyStorePath the trustKeyStorePath to set
     */
    public void setTrustKeyStorePath(String trustKeyStorePath) {
        this.trustKeyStorePath = trustKeyStorePath;
    }

    /**
     * @return the keyStoreType
     */
    public String getKeyStoreType() {
        return keyStoreType;
    }

    /**
     * @param keyStoreType the keyStoreType to set
     */
    public void setKeyStoreType(String keyStoreType) {
        this.keyStoreType = keyStoreType;
    }

    /**
     * @return the sslProtocol
     */
    public String getSslProtocol() {
        return sslProtocol;
    }

    /**
     * @param sslProtocol the sslProtocol to set
     */
    public void setSslProtocol(String sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    /**
     * @return the trustKeyStorePass
     */
    public String getTrustKeyStorePass() {
        return trustKeyStorePass;
    }

    /**
     * @param trustKeyStorePass the trustKeyStorePass to set
     */
    public void setTrustKeyStorePass(String trustKeyStorePass) {
        this.trustKeyStorePass = trustKeyStorePass;
    }

    /**
     * @return the hostnameVerify
     */
    public boolean isHostnameVerify() {
        return hostnameVerify;
    }

    /**
     * @param hostnameVerify the hostnameVerify to set
     */
    public void setHostnameVerify(boolean hostnameVerify) {
        this.hostnameVerify = hostnameVerify;
    }
    
    
}

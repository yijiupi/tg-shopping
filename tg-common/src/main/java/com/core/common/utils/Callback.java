/**
 * Callback.java
 */
package com.core.common.utils;

import java.io.IOException;


/**
 * 异步调用接口回调
 * @author Administrator
 *
 */
public interface Callback {
    /**
     * 失败回调
     * @param request
     * @param e
     */
    void onFailure(HttpRequest request, IOException e);
    /**
     * 数据响应
     * @param response
     */
    void onResponse(HttpResponse response);
}

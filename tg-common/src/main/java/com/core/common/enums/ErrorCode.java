package com.core.common.enums;

/**
 * 错误码
 * @author Administrator
 *
 */
public enum ErrorCode {
    /**
     * 错误码编号规则：
     * 错误码共6位：
     *   NN(2位应用区分码) + NNNN(4位错误唯一编码)
     *   应用区分码：
     *   共同： 10
     *   后台： 11
     *   商户： 12
     *   微信： 13
     */
    ERROR_SUCCESS("成功", 0),
    ERROR_SEQ_FAILED("生成序列号失败", 100001),
    ERROR_SERIALIZE_FAILED("对象序列化/反序列化失败", 100002),
    ERROR_NETWORK_FAILED("网络请求失败", 100003),
    ERROR_CALLAPI_FAILED("调用接口失败", 100004);
    int value;
    String label;
    ErrorCode(String label, int value) {
        this.label = label;
        this.value = value;
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * 由错误码获取枚举对象
     * @param value
     * @return
     */
    public static ErrorCode getEnum(int value) {
        ErrorCode resultEnum = null;
        ErrorCode[] enumAry = ErrorCode.values();
        for (int i = 0; i < enumAry.length; i++) {
            if (enumAry[i].getValue() == value) {
                resultEnum = enumAry[i];
                break;
            }
        }
        return resultEnum;
    }
}

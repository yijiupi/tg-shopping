package com.app.vo;

import java.util.Date;

/**
 * 优惠券
 * @author Administrator
 *
 */
public class CouponVO {
    //优惠券ID
    private Long couponId;
    //优惠券金额
    private Integer amount;
    //使用条件
    private String useConditions;
    //有效时间（开始）
    private Date effectiveTimeStart;
    //有效时间（结束）
    private Date effectiveTimeEnd;
    //使用状态，是否过期
    private Integer effectiveState;
    public Long getCouponId() {
        return couponId;
    }
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public String getUseConditions() {
        return useConditions;
    }
    public void setUseConditions(String useConditions) {
        this.useConditions = useConditions;
    }
    public Date getEffectiveTimeStart() {
        return effectiveTimeStart;
    }
    public void setEffectiveTimeStart(Date effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
    }
    public Date getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }
    public void setEffectiveTimeEnd(Date effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }
    public Integer getEffectiveState() {
        return effectiveState;
    }
    public void setEffectiveState(Integer effectiveState) {
        this.effectiveState = effectiveState;
    }
    
    
    
}

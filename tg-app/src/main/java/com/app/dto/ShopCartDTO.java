package com.app.dto;

import java.util.List;
/**
 * 购物车删除参数
 * @author Administrator
 *
 */
public class ShopCartDTO {

	// 合作商id
	private Integer businessId;
	// 合作商购物车商品集合
	private List<Integer> shopcartProductId;
	
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public List<Integer> getShopcartProductId() {
		return shopcartProductId;
	}
	public void setShopcartProductId(List<Integer> shopcartProductId) {
		this.shopcartProductId = shopcartProductId;
	}
	
	
}

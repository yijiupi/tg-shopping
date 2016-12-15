package com.app.dto;

import java.util.List;
/**
 * 商品传输参数
 * @author Administrator
 *
 */
public class ProductSpecIdDTO {

	// 合作商id
	private Integer businessId;
	// 合作商购物车商品集合
	private List<Integer> productSpecIdList;
	
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public List<Integer> getProductSpecIdList() {
		return productSpecIdList;
	}
	public void setProductSpecIdList(List<Integer> productSpecIdList) {
		this.productSpecIdList = productSpecIdList;
	}
	

	
}

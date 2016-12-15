package com.app.vo;

import java.util.List;
/**
 * 购物车
 * @author Administrator
 *
 */
public class ShopCartVO {
	// 合作商（京东，一号店等）
	private Integer businessId;
	// 合作商名称
	private String businessName;
	// 合作产品列表
	private List<ShopCartProductVO> productList;
	
	
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public List<ShopCartProductVO> getProductList() {
		return productList;
	}
	public void setProductList(List<ShopCartProductVO> productList) {
		this.productList = productList;
	}
	
	
}

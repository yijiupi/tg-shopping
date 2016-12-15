package com.app.vo;

import java.util.List;

/**
 * 合作商商品
 * @author Administrator
 *
 */
public class ProductBusinessVO {

	// 合作商（京东，一号店等）
	private Integer businessId;
	// 合作商名称
	private String businessName;
	// 合作商产品列表
	private List<ProductSpecVO> productList;
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
	public List<ProductSpecVO> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductSpecVO> productList) {
		this.productList = productList;
	}

	
}

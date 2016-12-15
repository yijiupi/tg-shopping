package com.app.dto.wrapper;
/**
 * 商品传入参数包装
 * @author Administrator
 *
 */
public class ProductWrapper {
	// 合作商id
	private Integer businessId; 
	// 商品id
	private Long productId;
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

}

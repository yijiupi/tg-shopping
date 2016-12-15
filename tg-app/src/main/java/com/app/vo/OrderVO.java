package com.app.vo;

/**
 * 我的订单（待确认：是否为每个合作商创建自己的订单，京东是拆了的）
 * @author Administrator
 *
 */
public class OrderVO {
	// 订单号
	private String orderId;
	// 订单总价
	private String totalPrice;
	// 合作产品列表
	private ProductBusinessVO ProductBusiness;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ProductBusinessVO getProductBusiness() {
		return ProductBusiness;
	}
	public void setProductBusiness(ProductBusinessVO productBusiness) {
		ProductBusiness = productBusiness;
	}

}

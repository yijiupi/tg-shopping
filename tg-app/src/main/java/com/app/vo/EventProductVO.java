package com.app.vo;

/**
 * 活动产品信息
 * @author Administrator
 *
 */
public class EventProductVO extends ProductVO{

	// 合作商id
	private Integer businessId;
	// 合作商名称
	private String businessName;
	// 原始价格
	private float price;
	// 排序
	private Byte sort;
	
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Byte getSort() {
		return sort;
	}
	public void setSort(Byte sort) {
		this.sort = sort;
	}
	
}

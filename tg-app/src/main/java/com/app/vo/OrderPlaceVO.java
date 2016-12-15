package com.app.vo;

import java.util.List;

/**
 * 合作商下单
 * @author Administrator
 *
 */
public class OrderPlaceVO {
	// 订单总价
	private float tatalPrice;
	// 运费
	private float tranportPrice;
	// 默认地址
	private AddressVO address;
	// 商品列表
	private List<ProductBusinessVO> shopCartList;
	public float getTatalPrice() {
		return tatalPrice;
	}
	public void setTatalPrice(float tatalPrice) {
		this.tatalPrice = tatalPrice;
	}
	public float getTranportPrice() {
		return tranportPrice;
	}
	public void setTranportPrice(float tranportPrice) {
		this.tranportPrice = tranportPrice;
	}
	public AddressVO getAddress() {
		return address;
	}
	public void setAddress(AddressVO address) {
		this.address = address;
	}
	public List<ProductBusinessVO> getShopCartList() {
		return shopCartList;
	}
	public void setShopCartList(List<ProductBusinessVO> shopCartList) {
		this.shopCartList = shopCartList;
	}
    
}

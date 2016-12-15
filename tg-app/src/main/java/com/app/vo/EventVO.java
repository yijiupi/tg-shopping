package com.app.vo;

import java.util.List;
/**
 * 活动
 * @author Administrator
 *
 */
public class EventVO {

	// 活动id
	private Integer id;
	// 活动名称
	private String name;
	// 活动图片地址
	private String imgUrl;
	// 活动产品列表
	private List<EventProductVO> product;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public List<EventProductVO> getProduct() {
		return product;
	}
	public void setProduct(List<EventProductVO> product) {
		this.product = product;
	}
}

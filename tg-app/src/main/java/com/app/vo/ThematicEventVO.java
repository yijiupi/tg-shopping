package com.app.vo;

import java.util.List;

/**
 * 专题活动
 * @author Administrator
 *
 */
public class ThematicEventVO {

	// 专题活动id
	private Integer id;
	// 专题活动图片地址
	private String imgUrl;
	// 专题活动产品列表
	private List<EventProductVO> eventProduct;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public List<EventProductVO> getEventProduct() {
		return eventProduct;
	}
	public void setEventProduct(List<EventProductVO> eventProduct) {
		this.eventProduct = eventProduct;
	}
	
}

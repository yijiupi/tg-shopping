package com.app.vo;

/**
 * 秒杀产品
 * @author Administrator
 *
 */
public class SecKillProductVO {

	// 秒杀产品id
	private Integer id;
	// 秒杀图片
	private String imgUrl;
	// 原始价格
	private float price;
	// 秒杀价格
	private float seckillPrice;
	// 秒杀开始时间
	private String beginTime;
	// 秒杀结束时间
	private String endTime;
	// 限制秒杀数量
	private Integer count;
	
	
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSeckillPrice() {
		return seckillPrice;
	}
	public void setSeckillPrice(float seckillPrice) {
		this.seckillPrice = seckillPrice;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	
}

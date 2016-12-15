package com.app.vo;
/**
 * 商品规格
 * @author Administrator
 *
 */
public class ProductSpecVO extends ProductVO{

    //商品颜色
    private String color;
    //商品尺寸
    private String size;
    //商品数量
    private Integer number;
    //商品官方原价
    private float officialPrice;
    //商品详情图片
    private String productDetailUrl;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public float getOfficialPrice() {
		return officialPrice;
	}
	public void setOfficialPrice(float officialPrice) {
		this.officialPrice = officialPrice;
	}
	public String getProductDetailUrl() {
		return productDetailUrl;
	}
	public void setProductDetailUrl(String productDetailUrl) {
		this.productDetailUrl = productDetailUrl;
	}
    
}

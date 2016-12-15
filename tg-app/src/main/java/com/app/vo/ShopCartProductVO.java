package com.app.vo;
/**
 * 购物车商品
 * @author Administrator
 *
 */
public class ShopCartProductVO extends ProductVO{
	// 购物车id
	private Long id; 
	// 产品品牌
	private String brand;
	// 三级分类名称
	private String subCategoryName;
	// 价格
	private float price;
	// 已省
	private float savePrice;
	// 库存数量
	private Integer count;
	// 颜色
	private String colour;
	// 尺寸
	private String size;
	
	public float getSavePrice() {
		return savePrice;
	}
	public void setSavePrice(float savePrice) {
		this.savePrice = savePrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}

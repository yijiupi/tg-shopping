package com.app.vo;
/**
 * 商品基础类
 * @author Administrator
 *
 */
public class ProductVO {
    // 商品ID
    private Long productSpecId;
    // 商品规格名称
    private String name;
    // 商品默认图片
    private String imgUrl;
    // 商品销售价
    private float salePrice;

	public Long getProductSpecId() {
		return productSpecId;
	}
	public void setProductSpecId(Long productSpecId) {
		this.productSpecId = productSpecId;
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
	public float getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

    
}

package com.app.dto.wrapper;

import java.util.List;

import com.app.dto.ProductSpecIdDTO;
/**
 * 购物车传入参数包装
 * @author Administrator
 *
 */
public class ShopCartWrapper {
	// 购物车每个合作商的商品id参数集合
	private List<ProductSpecIdDTO> wrapper;

	public List<ProductSpecIdDTO> getWrapper() {
		return wrapper;
	}
	public void setWrapper(List<ProductSpecIdDTO> wrapper) {
		this.wrapper = wrapper;
	}

	
	
}

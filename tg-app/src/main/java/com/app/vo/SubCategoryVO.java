package com.app.vo;

import java.util.List;
/**
 * 子分类（分类入口右部分）
 * @author Administrator
 *
 */
public class SubCategoryVO {
	
	// 同事圈
	private List<EventProductVO> productList;
	// 子分类
	private List<CategoryVO> subCategoryList;
	public List<EventProductVO> getProductList() {
		return productList;
	}
	public void setProductList(List<EventProductVO> productList) {
		this.productList = productList;
	}
	public List<CategoryVO> getSubCategoryList() {
		return subCategoryList;
	}
	public void setSubCategoryList(List<CategoryVO> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}
	
	
}

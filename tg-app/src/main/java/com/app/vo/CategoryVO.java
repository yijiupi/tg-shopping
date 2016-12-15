package com.app.vo;

import java.util.List;

/**
 * 分类（通用）
 * @author Administrator
 *
 */
public class CategoryVO {
	// 分类id
	private Integer id;
	// 分类名称
	private String name;
	// 分类下显示图片的url
	private String imgUrl;
	// 默认标识
	private boolean isDefault;

	// 该类目下的子类目列表
	private List<CategoryVO> subCategoryList;
	
	
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
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public List<CategoryVO> getSubCategoryList() {
		return subCategoryList;
	}
	public void setSubCategoryList(List<CategoryVO> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}
	
	
}

package com.app.vo;

/**
 * 榜单推荐
 * @author Administrator
 *
 */
public class RecommendListVO {

	// 榜单id
	private Integer id;
	// 榜单推荐名称
	private String name;
	// 榜单推荐图片地址
	private String imgUrl;
	// 榜单排序
	private Byte sort;
	
	
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
	public Byte getSort() {
		return sort;
	}
	public void setSort(Byte sort) {
		this.sort = sort;
	}
	
	
}

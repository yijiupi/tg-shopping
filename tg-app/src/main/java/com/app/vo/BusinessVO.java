package com.app.vo;

/**
 * 合作商
 * @author Administrator
 *
 */
public class BusinessVO {
	// 合作商id
	private Integer id;
	// 合作商名称
	private String name;
	// 是否默认
	private boolean isDefault;
	
	
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
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	@Override
	public String toString() {
		return "BusinessVO [id=" + id + ", name=" + name + ", isDefault=" + isDefault + "]";
	}
	
	
}

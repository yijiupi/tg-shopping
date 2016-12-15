package com.app.dto;
/**
 * 新建地址
 * @author Administrator
 *
 */
public class AddressDTO {
	private Long id;
	// 收货人
	private String name;
	// 手机号码
	private String mobileNumber;
	// 地区
	private String area;
	// 详细地址
	private String detailAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	
}

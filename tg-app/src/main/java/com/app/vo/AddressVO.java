package com.app.vo;
/**
 * 用户收货地址
 * @author Administrator
 *
 */
public class AddressVO {
    //收货地址ID
    private Long id;
    //收货人姓名
    private String name;
    //收货电话
    private String mobileNumber;
    //收货人具体省份，城市
    private String area;
    //收货人具体地址
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

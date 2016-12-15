package com.app.vo;

import java.util.List;
/**
 * 首页中间部分，活动块
 * @author Administrator
 *
 */
public class EventHomepageVO {
	
	// 首页图片地址
	private String mainImgUrl;
	// 福利金
	private Integer welfare;
	// 秒杀专区
	private List<SecKillProductVO> secKillProductList;
	// 榜单推荐
	private List<RecommendListVO> recommendList;
	// 专题活动
	private ThematicEventVO thematicEvent;
	
	
	
	public String getMainImgUrl() {
		return mainImgUrl;
	}
	public void setMainImgUrl(String mainImgUrl) {
		this.mainImgUrl = mainImgUrl;
	}
	public Integer getWelfare() {
		return welfare;
	}
	public void setWelfare(Integer welfare) {
		this.welfare = welfare;
	}
	public List<SecKillProductVO> getSecKillProductList() {
		return secKillProductList;
	}
	public void setSecKillProductList(List<SecKillProductVO> secKillProductList) {
		this.secKillProductList = secKillProductList;
	}
	public List<RecommendListVO> getRecommendList() {
		return recommendList;
	}
	public void setRecommendList(List<RecommendListVO> recommendList) {
		this.recommendList = recommendList;
	}
	public ThematicEventVO getThematicEvent() {
		return thematicEvent;
	}
	public void setThematicEvent(ThematicEventVO thematicEvent) {
		this.thematicEvent = thematicEvent;
	}
	
	

}

package com.app.controller.main;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.vo.BusinessVO;
import com.app.vo.EventHomepageVO;
import com.app.vo.EventProductVO;
/**
 * 首页入口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/HomePage")
public class HomePageController extends BaseController{

	/**
	 * 合作商分类展示和推荐
	 */
	@RequestMapping(value="/business/get", method=RequestMethod.GET)
	public List<BusinessVO> getBusiness() {
		System.out.println("xxxxxxx");
		return null;
	}
	
	/**
	 * 首页活动展示
	 */
	@RequestMapping(value="/event/get", method=RequestMethod.GET)
	public EventHomepageVO getEvent() {
		System.out.println("xxxxxxx");
		return null;
	}
	
	/**
	 * 首页同事疯抢展示
	 */
	@RequestMapping(value="/nearBuy/get", method=RequestMethod.GET)
	public List<EventProductVO> getNearBuy() {
		System.out.println("xxxxxxx");
		return null;
	}
}

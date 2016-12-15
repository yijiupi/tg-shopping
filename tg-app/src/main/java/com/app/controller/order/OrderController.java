package com.app.controller.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.dto.wrapper.ProductWrapper;
import com.app.dto.wrapper.ShopCartWrapper;
import com.app.vo.CouponVO;
import com.app.vo.OrderPlaceVO;
import com.app.vo.OrderVO;

/**
 * 订单
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController{
	
    /**
     * 购物车去结算确认订单（待定）
     * @param wrapper
     * @return String 缓存key
     */
    @RequestMapping(value="/confirmShopcart/post", method=RequestMethod.POST)
    public OrderPlaceVO confirmShopcartGet(@RequestBody ShopCartWrapper wrapper){
        return new OrderPlaceVO();
    }
    
	/**
	 * 商品立即购买确认订单
     * @param wrapper
     * @return OrderPlaceVO
	 */
	@RequestMapping(value="/confirmProduct/post", method=RequestMethod.POST)
	public OrderPlaceVO confirmProductPost(@ModelAttribute ProductWrapper wrapper) {
		return new OrderPlaceVO();
	}
	
	/**
	 * 购物车结算下单
	 * @param wrapper
	 */
    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void orderPut(@RequestBody ShopCartWrapper wrapper){
    	
    }
    
    /**
     * 我的订单
     * @param userId
     * @return List<OrderVO>
     */
    @RequestMapping(value="/get", method=RequestMethod.GET)
    public List<OrderVO> orderGet(@RequestParam Long userId){
        return new ArrayList<>();
    }
    /**
     * 获取优惠券列表
     * @param userId
     * @return List<CouponVO>
     */
    @RequestMapping(value="/coupon/get", method=RequestMethod.GET)
    public List<CouponVO> couponGet(@RequestParam Long userId){ 
        return new ArrayList<CouponVO>();
    }

}

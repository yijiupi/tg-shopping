package com.app.controller.main;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.dto.ProductSpecIdDTO;
import com.app.dto.wrapper.ShopCartWrapper;
import com.app.vo.ShopCartVO;
/**
 * 购物车入口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/ShopCart")
public class ShopCartController extends BaseController{

	/**
	 * 获取购物车列表
	 * @return List<ShopCartVO>
	 */
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<ShopCartVO> get() {
		return null;
	}
	
	/**
	 * 删除购物车商品
	 * @param wrapper
	 */
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void delete(@RequestBody ShopCartWrapper wrapper) {
		for(ProductSpecIdDTO o : wrapper.getWrapper()) {
			System.out.println("合作商："+ o.getBusinessId());
			for(Integer i : o.getProductSpecIdList()) {				
				System.out.println("合作商商品id:"+ i + ":" + o.getBusinessId());
			}
		}
	}
	
	/**
	 * 加入购物车
	 * @param dto
	 */
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public void post(@RequestBody ProductSpecIdDTO dto) {
			System.out.println("合作商："+ dto.getBusinessId());
			for(Integer i : dto.getProductSpecIdList()) {				
				System.out.println("合作商商品id:"+ i + ":" + dto.getBusinessId());
			}
	}
	
	
	
	// TODO 结算是前端调转自己组装
	
}

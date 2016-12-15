package com.app.controller.product;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.dto.wrapper.ProductWrapper;
import com.app.vo.ProductBusinessVO;
/**
 * 商品详情
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController{
	/**
	 * 获取商品详情
	 * @param wrapper
	 * @return ProductBusinessVO
	 */
    @RequestMapping(value="/deatil/get", method=RequestMethod.GET)
    public ProductBusinessVO detailGet(@ModelAttribute ProductWrapper wrapper){
    	System.out.println("xxxxxxxxxxxxxdddddddddddddddd");
        return new ProductBusinessVO();
    }
    
}

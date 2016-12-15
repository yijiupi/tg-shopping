package com.app.controller.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.vo.CategoryVO;
import com.app.vo.SubCategoryVO;
/**
 * 分类入口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/Category")
public class CategoryController extends BaseController{

	/**
	 * 获取全部一级主分类
	 * @return List<CategoryVO>
	 */
	@RequestMapping(value="/main/get", method=RequestMethod.GET)
	public List<CategoryVO> getMain() {
		CategoryVO vo = new CategoryVO();
		vo.setId(1000);
		vo.setName("为您推荐");
		vo.setImgUrl("Http://www.baidu.com");
		vo.setDefault(true);
		CategoryVO vo1 = new CategoryVO();
		vo1.setId(1001);
		vo1.setName("潮流女装");
		vo1.setImgUrl("Http://www.baidu.com");
		vo1.setDefault(false);
		CategoryVO vo2 = new CategoryVO();
		vo2.setId(1002);
		vo2.setName("家用电器");
		vo2.setImgUrl("Http://www.baidu.com");
		vo2.setDefault(false);
		List<CategoryVO> list = new ArrayList<>();
		list.add(vo);
		list.add(vo1);
		list.add(vo2);
		
		//RedisNormal.getJedis().set(Keys.CATEGORY_MAIN,  JSONObject.toJSONString(list));
		return list;
	}

	/**
	 * 获取一级分类下的子分类，二三级分类
	 * @param id 一级分类id
	 * @return SubCategoryVO
	 */
	@RequestMapping(value="/sub/get", method=RequestMethod.GET)
	public SubCategoryVO getSub(@RequestParam Integer id) {
		SubCategoryVO subCategoryVO = new SubCategoryVO();
		CategoryVO vo311 = new CategoryVO();
		vo311.setId(20011);
		vo311.setName("时尚羽绒");
		vo311.setImgUrl("Http://www.baidu.com");
		CategoryVO vo312 = new CategoryVO();
		vo312.setId(20011);
		vo312.setName("轻薄羽绒");
		vo312.setImgUrl("Http://www.baidu.com");
		List<CategoryVO> list3 = new ArrayList<>();
		list3.add(vo311);
		list3.add(vo312);
		logger.info("xxxxxxxxxxxxxxx"+id);
		
		
		CategoryVO vo21 = new CategoryVO();
		vo21.setId(2001);
		vo21.setName("热门品类");
		vo21.setImgUrl("Http://www.baidu.com");
		vo21.setSubCategoryList(list3);
		CategoryVO vo22 = new CategoryVO();
		vo22.setId(2002);
		vo22.setName("裙装");
		vo22.setImgUrl("Http://www.baidu.com");
		vo22.setSubCategoryList(list3);
		List<CategoryVO> list2 = new ArrayList<>();
		list2.add(vo21);
		list2.add(vo22);
		subCategoryVO.setSubCategoryList(list2);
		
		//RedisNormal.getJedis().hset(Keys.CATEGORY_SUB, id.toString(), JSONObject.toJSONString(subCategoryVO));
		return subCategoryVO;
	}
	
	// TODO 根据一级分类id进入店铺
	// TODO 根据三级分类id查询商品列表
}

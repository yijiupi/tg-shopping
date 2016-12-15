package com.app.cache.controller.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.app.cache.controller.BaseCacheController;
import com.app.keys.main.Keys;
import com.core.common.utils.HttpClientUtils;
import redis.clients.jedis.JedisCluster;
/**
 * 分类入口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/CategoryCache")
public class CategoryCacheController extends BaseCacheController{
	
	@Autowired
	private JedisCluster jedisCluster;
	/**
	 * 获取全部一级主分类
	 * @return List<CategoryVO>
	 */
	@RequestMapping(value="/main/get", method=RequestMethod.GET)
	public Object getMain() {
		String list = jedisCluster.get(Keys.CATEGORY_MAIN);
		logger.info("缓存获取结果："+list);
		if(list==null) {
			list = HttpClientUtils.httpGet("Http://localhost:8080/tg-app/Category/main/get", new HashMap<>());
			jedisCluster.set(Keys.CATEGORY_MAIN, list);
			logger.info("查询数据库");
		}
		return JSONObject.parse(list);
	}

	/**
	 * 获取一级分类下的子分类，二三级分类
	 * @param id 一级分类id
	 * @return SubCategoryVO
	 */
	@RequestMapping(value="/sub/get", method=RequestMethod.GET)
	public Object getSub(@RequestParam Integer id) {
		String list = jedisCluster.hget(Keys.CATEGORY_SUB, id.toString());
		logger.info("缓存获取结果："+list);
		if(list==null) {
			Map<String, String> hashMap = new HashMap<>();
			hashMap.put("id", id.toString());
			list = HttpClientUtils.httpGet("Http://localhost:8080/tg-app/Category/sub/get", hashMap);
			jedisCluster.hset(Keys.CATEGORY_SUB, id.toString(), list);
			logger.info("查询数据库");
		}
		return JSONObject.parse(list);
	}
	
	// TODO 根据一级分类id进入店铺
	// TODO 根据三级分类id查询商品列表
}

package com.app.controller.event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.controller.BaseController;
import com.app.vo.EventVO;
/**
 * 活动二级页面
 * @author Administrator
 *
 */
@RequestMapping("/event")
public class EventController extends BaseController{
    /**
     * 专题活动
     * @param id
     * @return EventVO
     */
    @RequestMapping(value="/thematic/get", method=RequestMethod.GET)
    public EventVO getThematic(@RequestParam Integer id){
        return null;
    }
    
    /**
     * 榜单推荐
     * @param id
     * @return EventVO
     */
    @RequestMapping(value="/recommendList/get", method=RequestMethod.GET)
    public EventVO getRecommendList(@RequestParam Integer id){
        return null;
    }
    
    /**
     * 活动推荐
     * @param id
     * @return EventVO
     */
    @RequestMapping(value="/recommend/get", method=RequestMethod.GET)
    public EventVO getRecommendEvent(Integer id){
    	return null;
    }
    
}

package com.app.controller.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;
import com.app.dto.AddressDTO;
import com.app.vo.AddressVO;
/**
 * 地址
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/address")
public class AddressController extends BaseController{

    
    /**
     * 获取用户所有收货地址
     * @param userId
     * @return List<AddressVO>
     */
    @RequestMapping(value="/get", method=RequestMethod.GET)
    public List<AddressVO> get(@RequestParam Long userId){
        return new ArrayList<AddressVO>();
    }

    /**
     * 新建收货地址
     * @param address
     */
    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void post(@ModelAttribute AddressDTO address){
        // TODO
    }
    /**
     * 删除用户地址信息
     * @param id
     */
    @RequestMapping(value="/delete", method=RequestMethod.DELETE)
    public void delete(@RequestParam Long id){
        // TODO
    }
    /**
     * 编辑用户地址信息
     * @param address
     */
    @RequestMapping(value="/put", method=RequestMethod.PUT)
    public void put(@ModelAttribute AddressDTO address){
        // TODO
    }
}

package com.app.controller.main;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.BaseController;

/**
 * 我的入口
 * @author Administrator
 *
 */
@RestController
public class MyInfoController extends BaseController{

	//the parameter was converted in initBinder
	@RequestMapping("/date")
	public String date(Date date){
		Date date2 = new Date();
		System.out.println(date2);
	    System.out.println(date);
	    return "hello";
	}
}

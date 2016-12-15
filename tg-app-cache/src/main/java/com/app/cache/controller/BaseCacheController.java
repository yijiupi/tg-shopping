package com.app.cache.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestController;
import com.core.binder.DateEditor;
import com.core.exception.BusinessException;
/**
 * 基础Controller
 * @author Administrator
 *
 */
@RestController
public class BaseCacheController {
	
	protected static final Logger logger = LoggerFactory.getLogger(BaseCacheController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	@ExceptionHandler(BusinessException.class)
	public BusinessException handleCustomException(BusinessException ex) {
		// TODO
		
		logger.info("我在这里处理通用异常！");
		ex.printStackTrace();
		return ex;
	}

	@ExceptionHandler(Exception.class)
	public Exception handleAllException(Exception ex) {
		// TODO 
		logger.info("我在这里处理系统级别异常！");
		ex.printStackTrace();
		return ex;
	}

}

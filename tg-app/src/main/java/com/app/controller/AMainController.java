package com.app.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.core.exception.BusinessException;
/**
 * 测试Controller
 * @author Administrator
 *
 */
@RestController
public class AMainController extends BaseController{

	@RequestMapping(value = "/{type:.+}", method = RequestMethod.POST)
	public void POST(@PathVariable("type") String type) throws Exception {

		if ("error".equals(type)) {
			throw BusinessException.CALLAPI_ERROR;
		} else if ("io-error".equals(type)) {
			throw new IOException();
		} else {
			throw new Exception();
		}

	}
}

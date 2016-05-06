package com.reos.web.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reos.web.bean.TestBean;

@RestController
public class TestController {

	@RequestMapping(value="/rest/test")
	@ResponseBody
	private TestBean test(@RequestBody(required=false) TestBean bean){
		System.out.println("dddddddddddddddddddddddddddddddddddddd");
		return bean;
	}
}

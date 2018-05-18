package com.lzm.demo_bo.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzm.demo_bo.model.Domain;
import com.lzm.demo_bo.service.DomainService;
import com.lzm.demo_bo.service.ExampleService;

/**
* @author 爱不留   
* @date 2018年5月17日 下午2:10:39 
**/
@RestController
public class IndexController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExampleService exampleService; 
	
	@Autowired
	private DomainService domainService; 
	
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		
		exampleService.show();
		
		request.getSession().setAttribute("a", "a");
		
		
		List<Domain> list = domainService.list(new HashMap<String, Object>());
		logger.info(">>>: " + list.size());
		
		return "Hello World!" + request.getSession().getAttribute("a");
	}

}

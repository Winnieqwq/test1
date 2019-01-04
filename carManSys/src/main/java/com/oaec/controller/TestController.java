package com.oaec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oaec.service.IUser;

@Controller
public class TestController {
    @Autowired
	private IUser iu;
	@ResponseBody
	@RequestMapping("/hello.do")
	public String hello() {
		 return "hello world!";
	}
	
	@RequestMapping("/index.do")
	public String index() {
		return "/WEB-INF/view/index.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/findUsers.do")
	public List<Map<String, Object>> findUsers(){
		
		return iu.selectUsers();
		
	}
}


package com.my.blog.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jianli {
	@RequestMapping(value="/jianli")
	public String index(){
		return  "jianli";
	}
}

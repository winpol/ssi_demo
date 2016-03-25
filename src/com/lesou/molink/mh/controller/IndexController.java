package com.lesou.molink.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 创建时间：2015-1-28 下午1:17:27
 * 
 * @author pol.wang
 * @version 2.2
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String home_index() {
		return "/home/index";
	}	
}

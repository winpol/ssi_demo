package com.lesou.molink.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lesou.molink.mh.model.UserInfo;
import com.lesou.molink.mh.service.UserService;

/**
 * 创建时间：2015-1-28 下午1:17:27
 * 
 * @author andy
 * @version 2.2
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId) {
		UserInfo userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}

	@RequestMapping("/showInfos")
	public @ResponseBody
	Object showUserInfos() {
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
}

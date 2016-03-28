/**
 * Project Name:ssi_molink_mh
 * File Name:JoinController.java
 * Package Name:com.lesou.molink.mh.controller
 * Date:2016-1-13下午10:35:36
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.lesou.molink.mh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lesou.molink.mh.model.JoinInfo;
import com.lesou.molink.mh.service.JoinInfoService;

/**
 * ClassName:JoinController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-1-13 下午10:35:36 <br/>
 * @author   h2t
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("/cus")
public class JoinController {
	
	@Autowired
	private JoinInfoService joinInfoService;
	
	@ResponseBody
	@RequestMapping("/join")
	public int add(ModelMap modelMap,String name,String tel,String company,String qq){
		JoinInfo info=new JoinInfo(); 
		info.setCname(name);
		info.setCompany(company);
		info.setCmobile(tel); 
		info.setQq(qq);
		info.setStatus(0);
		joinInfoService.insert(info);  
		return 200;
	}
}


package com.lesou.molink.mh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lesou.molink.mh.model.BaomingInfo;
import com.lesou.molink.mh.service.BaomingService;

/**
 * 创建时间：2015-1-28 下午1:17:27
 * 
 * @author pol.wang
 * @version 2.2
 */
@Controller
@RequestMapping("/fh")
public class BaomingController {

	@Autowired
	private BaomingService baomingService;

	@RequestMapping("/add")
	@ResponseBody
	public int baoming(ModelMap modelMap, String contact, String mobile,
			String company, String address, String email, String remark) {

		BaomingInfo info = new BaomingInfo();
		info.setCname(contact);
		info.setCmobile(mobile);
		info.setCemail(email);
		info.setCcompany(company);
		info.setCaddress(address);
		info.setCsex(0);
		info.setCremark(remark);
		info.setFlag(1);
		baomingService.insert(info);
		return 200;
	}

	@RequestMapping("/listAll")
	@ResponseBody
	public Map<String, Object> listAll(ModelMap modelMap) {

		Map<String, Object> map = new HashMap<String, Object>();
		List<BaomingInfo> infos = baomingService.getInfos();
		map.put("rows", infos);
		map.put("total", 10);
		return map;
	}

	@RequestMapping("/edit")
	@ResponseBody
	public BaomingInfo edit(@RequestParam int id) {

		BaomingInfo info = baomingService.getInfoById(id);

		return info;
	}
	@RequestMapping("/delete")
	@ResponseBody
	public int delete(@RequestParam int id) {

		int result = baomingService.deteleInfoById(id);
		return 200;
	}
}

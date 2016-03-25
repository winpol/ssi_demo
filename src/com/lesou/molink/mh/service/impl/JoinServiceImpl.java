/**
 * Project Name:ssi_molink_mh
 * File Name:JoinServiceImpl.java
 * Package Name:com.lesou.molink.mh.service.impl
 * Date:2016-1-13下午10:33:41
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.lesou.molink.mh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lesou.molink.mh.dao.JoinInfoMapper;
import com.lesou.molink.mh.model.JoinInfo;
import com.lesou.molink.mh.service.JoinInfoService;

/**
 * ClassName:JoinServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-1-13 下午10:33:41 <br/>
 * @author   h2t
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("joinInfoService")
public class JoinServiceImpl implements JoinInfoService {

	@Autowired
	private JoinInfoMapper joinInfoMap;
	
	public int insert(JoinInfo JoinInfo) { 
		return joinInfoMap.insert(JoinInfo);
	}

}


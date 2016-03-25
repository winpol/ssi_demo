package com.lesou.molink.mh.service;

import java.util.List;

import com.lesou.molink.mh.model.UserInfo;

/**  
 * 创建时间：2015-1-27 下午5:15:03  
 * @author andy  
 * @version 2.2  
 */

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}

package com.lesou.molink.mh.service;

import java.util.List;

import com.lesou.molink.mh.model.BaomingInfo;

public interface BaomingService {

	BaomingInfo getInfoById(int id);
	
	List<BaomingInfo> getInfos();
	
	int insert(BaomingInfo baominginfo);

	int deteleInfoById(int id);
}

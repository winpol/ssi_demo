package com.lesou.molink.mh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lesou.molink.mh.dao.BaomingInfoMapper;
import com.lesou.molink.mh.model.BaomingInfo;
import com.lesou.molink.mh.service.BaomingService;


@Service("baomingService")
public class BaomingServiceImpl implements BaomingService {

	@Autowired
	private BaomingInfoMapper baomingInfoMapper;

	public BaomingInfo getInfoById(int id) {
		return baomingInfoMapper.selectByPrimaryKey(id);
	}

	public List<BaomingInfo> getInfos() {
		return baomingInfoMapper.selectAll();
	}

	public int insert(BaomingInfo baominginfo) {
		return baomingInfoMapper.insert(baominginfo);
	}

	public int deteleInfoById(int id) {
		return baomingInfoMapper.deleteByPrimaryKey(id);
	}
	
}

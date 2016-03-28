package com.lesou.molink.mh.dao;

import java.util.List;

import com.lesou.molink.mh.model.BaomingInfo;


public interface BaomingInfoMapper {
    
	BaomingInfo selectByPrimaryKey(Integer id);
	
	List<BaomingInfo> selectAll();
	
	int insert(BaomingInfo BaomingInfo);
	
	int deleteByPrimaryKey(Integer id);
}
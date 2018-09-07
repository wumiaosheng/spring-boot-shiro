package com.neo.hapi.dao.my;

import java.util.List;
import java.util.Map;

import com.neo.common.entity.FlipInfo;
import com.neo.hapi.entity.HapCode;

public interface HapCodeMyDao {

	public List<HapCode> findByPage(FlipInfo<HapCode> fpi);
	
	public List<HapCode> findByMap(Map param);
	
	public List<HapCode> find(Map param);

}
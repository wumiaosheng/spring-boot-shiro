package com.neo.hapi.dao.my;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neo.hapi.entity.HapCode;

public interface HapCodeMyDao {

	//public List<HapCode> findByPage(FlipInfo<HapCode> fpi);
	
	public List<HapCode> findByMap(Map param);
	
	public List<HapCode> find(Map param);

}
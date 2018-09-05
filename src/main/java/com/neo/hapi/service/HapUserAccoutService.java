package com.neo.hapi.service;

import java.util.List;
import java.util.Map;

import com.neo.common.entity.ReturnStatus;
import com.neo.hapi.entity.HapUserAccount;

public interface HapUserAccoutService {

	public ReturnStatus update(HapUserAccount hua);
	
	public ReturnStatus delete(long  id);
	
	public HapUserAccount findById(long  id);
	
	public List<HapUserAccount> find(Map map);
	
}

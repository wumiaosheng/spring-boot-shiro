package com.neo.hapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.neo.common.entity.ReturnStatus;
import com.neo.hapi.dao.HapUserAccountDao;
import com.neo.hapi.entity.HapUserAccount;

public class HapUserAccoutServiceImpl implements HapUserAccoutService{
  
	@Autowired
	private HapUserAccountDao  hapUserAccountDao;

	@Override
	public ReturnStatus update(HapUserAccount hua) {
		// TODO Auto-generated method stub
		hapUserAccountDao.update(hua);
		return new ReturnStatus(true);
	}

	@Override
	public ReturnStatus delete(long id) {
		// TODO Auto-generated method stub
		hapUserAccountDao.delete(id);
		return new ReturnStatus(true);
	}

	@Override
	public HapUserAccount findById(long id) {
		// TODO Auto-generated method stub
		HapUserAccount hua=hapUserAccountDao.findById(id);
		return hua;
	}

	@Override
	public List<HapUserAccount> find(Map map) {
		// TODO Auto-generated method stub
		return hapUserAccountDao.find(map);
	}
}

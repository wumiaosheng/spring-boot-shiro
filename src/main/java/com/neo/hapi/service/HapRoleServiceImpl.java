package com.neo.hapi.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.hapi.dao.my.HapRoleMyDao;

@Service
public class  HapRoleServiceImpl implements HapRoleService{

	@Autowired
	private HapRoleMyDao HapRoleMyDao;
	
	@Override
	public Set<String> findRoleByUserId(long userId) {
		// TODO Auto-generated method stub
		return HapRoleMyDao.findRoleByUserId(userId);
	}
	

}

package com.neo.hapi.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.hapi.dao.my.HapMenuMyDao;

@Service
public class HapMenuServiceImpl implements HapMenuService{

	@Autowired
	private HapMenuMyDao hapMenuMyDao;
	
	@Override
	public Set<String> findPermissionByUserId(long userId) {
		// TODO Auto-generated method stub
		if(userId>0){
			return	hapMenuMyDao.findPermissionByUserId(userId);
		}
		return null;
	}
}

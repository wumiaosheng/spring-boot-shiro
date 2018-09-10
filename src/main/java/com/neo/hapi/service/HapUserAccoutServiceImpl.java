package com.neo.hapi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.common.entity.ReturnStatus;
import com.neo.hapi.dao.HapUserAccountDao;
import com.neo.hapi.entity.HapUserAccount;

@Service
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
	public List<HapUserAccount> findEnable() {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("enable", "1");
		return hapUserAccountDao.find(map);
	}

	@Override
	public HapUserAccount login(Map map) {
		// TODO Auto-generated method stub
		List<HapUserAccount> list=hapUserAccountDao.find(map);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
}

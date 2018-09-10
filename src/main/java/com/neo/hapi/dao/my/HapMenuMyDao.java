package com.neo.hapi.dao.my;

import java.util.Set;

public interface HapMenuMyDao {

	
	
	public Set<String> findPermissionByUserId(long userId);

}
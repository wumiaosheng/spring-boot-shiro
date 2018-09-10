package com.neo.hapi.service;

import java.util.Set;


public interface  HapRoleService {

	public Set<String> findRoleByUserId(long userId);
}

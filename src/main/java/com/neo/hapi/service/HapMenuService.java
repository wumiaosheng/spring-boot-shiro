package com.neo.hapi.service;

import java.util.Set;

public interface HapMenuService {

	public Set<String> findPermissionByUserId(long userId);
}

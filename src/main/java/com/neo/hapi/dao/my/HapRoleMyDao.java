package com.neo.hapi.dao.my;

import java.util.Set;

import org.apache.ibatis.annotations.Select;

public interface HapRoleMyDao {

	
	@Select("select hr.rolecode from hap_role hr join Hap_User_Role hur on hur.role_Id=hr.id where hur.user_id = #{userId}")
	public Set<String> findRoleByUserId(long userId);

	

}
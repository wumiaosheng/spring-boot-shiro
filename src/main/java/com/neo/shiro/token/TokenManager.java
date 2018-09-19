package com.neo.shiro.token;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

import com.neo.hapi.entity.HapUserAccount;



/**
 * 
 * <p>
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2014年3月3日 　<br/>
 * <p>
 * 
 * @author zhou-baicheng
 * 
 * @version 1.0,2014年3月3日 
 * 
 * Shiro管理下的Token工具类
 */
public class TokenManager {
	
	
	/**
	 * 获取当前登录的用户User对象
	 * @return
	 */
	public static HapUserAccount getToken(){
		HapUserAccount token = (HapUserAccount)SecurityUtils.getSubject().getPrincipal();
		return token ;
	}
	
	/**
	 * 登录
	 * @param user
	 * @param rememberMe
	 * @return
	 */
	public static HapUserAccount login(HapUserAccount user,Boolean rememberMe){
		ShiroToken token = new ShiroToken(user.getAccount(), user.getPassword());
		token.setRememberMe(rememberMe);
		SecurityUtils.getSubject().login(token);
		return getToken();
	}
	
	
	/**
	 * 获取当前用户ID
	 * @return
	 */
	public static Long getUserId(){
		return getToken()==null?null:getToken().getId();
	}
	


	
	
}

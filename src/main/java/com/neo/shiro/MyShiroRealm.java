package com.neo.shiro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.neo.hapi.dao.my.HapRoleMyDao;
import com.neo.hapi.entity.HapUserAccount;
import com.neo.hapi.service.HapMenuService;
import com.neo.hapi.service.HapUserAccoutService;
import com.neo.shiro.token.ShiroToken;
import com.neo.shiro.token.TokenManager;





public class MyShiroRealm extends AuthorizingRealm {
	
	@Autowired
	private HapUserAccoutService hapUserAccoutService;
	
	@Autowired
	private HapRoleMyDao hapRoleMyDao;
	
	@Autowired 
	private HapMenuService hapMenuService;
   
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        
    	Long userId = TokenManager.getUserId();
		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
		//根据用户ID查询角色（role），放入到Authorization里。
		Set<String> roles = hapRoleMyDao.findRoleByUserId(userId);
		info.setRoles(roles);
		//根据用户ID查询权限（permission），放入到Authorization里。
		Set<String> permissions = hapMenuService.findPermissionByUserId(userId);
		info.setStringPermissions(permissions);
        return info;
    }

   /// 主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException {
    	ShiroToken token = (ShiroToken) authcToken;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("account", token.getUsername());
		map.put("password", token.getPswd());
		HapUserAccount user=hapUserAccoutService.login(map);
		if(null == user){
			throw new AccountException("帐号或密码不正确！");
		/**
		 * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
		 */
		}/*else if(UUser._0.equals(user.getStatus())){
			//throw new DisabledAccountException("帐号已经禁止登录！");
		}*/else{
			//更新登录时间 last login time
			
			//user.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
			//uuserService.updateByPrimaryKeySelective(user);
		}
		return new SimpleAuthenticationInfo(user,user.getPassword(), getName());
    }

}
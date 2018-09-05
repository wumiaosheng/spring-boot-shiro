package com.neo.hapi.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.common.util.RedisUtil;
import com.neo.hapi.entity.HapUserAccount;
import com.neo.hapi.service.HapUserAccoutService;

@RestController
@RequestMapping("/hapUserAccout")
public class HapUserAccoutController {
	@Autowired
	private HapUserAccoutService  hapUserAccoutService;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@RequestMapping("/findById")
	public HapUserAccount findById(long id){
		return hapUserAccoutService.findById(id);
	}
    
	@RequestMapping("/findByMap")
	public List<HapUserAccount> findByMap(){
		return hapUserAccoutService.findEnable();
	}
	
	@RequestMapping("/addRedis")
	public void addRedis(){
		redisTemplate.boundValueOps("test").set("12343243");
		System.err.println("添加成功");
	}
	
	
}

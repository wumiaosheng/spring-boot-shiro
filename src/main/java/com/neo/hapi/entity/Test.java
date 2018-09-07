package com.neo.hapi.entity;

import com.neo.common.entity.MyBatisEntity;

public class Test extends MyBatisEntity {

	private java.lang.String name;
	private long age;

	public java.lang.String getName() {
		return name;
	}
	
	public void setName(java.lang.String name){ 
        this.name = name;
    }
	public long getAge() {
		return age;
	}
	
	public void setAge(long age){ 
        this.age = age;
    }

}
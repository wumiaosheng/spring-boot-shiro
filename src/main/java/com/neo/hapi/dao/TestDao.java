package com.neo.hapi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neo.hapi.entity.Test;

public interface TestDao {

	@Insert("insert into test (id, name, age) values(#{id}, #{name,jdbcType=VARCHAR}, #{age})")
	public int insert(Test test);
	
	@Delete("delete from test where id=#{id}")
	public int delete(long id);
	
	@Update("update test set id=#{id}, name=#{name,jdbcType=VARCHAR}, age=#{age} where id=#{id}")
	public int update(Test test);
	
	@Select("select * from test where id = #{id}")
	public Test findById(long id);

	@Select("select * from test")
	public List<Test> findAll();

	//public List<Test> findByPage(FlipInfo<Test> fpi);
	
	public List<Test> findByMap(Map param);
	
	public List<Test> find(Map param);

}
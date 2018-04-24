/**
 * 
 */
package com.crud.dao;

import java.util.List;
import java.util.Map;
import com.modle.UserLogin;

/**
 * @author wph
 * 2018年4月24日下午4:52:33
 */
public interface UserLoginDao {

//	public List<UserLogin> findAll() throws Exception;
	
	public UserLogin findUserByUserName(String username) throws Exception;
	
	public UserLogin findUserById(int id) throws Exception;
	
	//分页查询方法
	public List<UserLogin> pageFindAll(Map param)throws Exception;
	
	public void addUser(UserLogin userlogin)throws Exception;
	
	public void updateUser(UserLogin uderlogin) throws Exception;
	
	public void deleteUser(int id) throws Exception;
	
	public int userCount() throws Exception;
	
}

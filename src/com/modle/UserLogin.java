/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author wph
 * 2018年4月24日下午3:48:34
 */
public class UserLogin implements Serializable {

//	账户id
	private int id;
//	账号
	private String username;
//	密码
	private String password;

	
	public UserLogin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}

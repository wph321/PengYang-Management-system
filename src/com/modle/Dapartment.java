/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author wph
 * 2018年4月24日下午3:53:11
 */
public class Dapartment implements Serializable {

	private int id;
//	部门名称
	private String name;
	
	public Dapartment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Dapartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dapartment [id=" + id + ", name=" + name + "]";
	}
	
}

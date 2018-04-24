/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author admin 2018年4月24日下午4:08:30
 */
public class Files implements Serializable {

	private int id;
	// 文件地址
	private String address;
	// 文件名
	private String name;
	// 文件大小
	private int size;
	// 上传者
	private UserLogin ul;

	public Files(int id, String address, String name, int size, UserLogin ul) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.size = size;
		this.ul = ul;
	}

	public Files() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public UserLogin getUl() {
		return ul;
	}

	public void setUl(UserLogin ul) {
		this.ul = ul;
	}

	@Override
	public String toString() {
		return "Files [id=" + id + ", address=" + address + ", name=" + name + ", size=" + size + ", ul=" + ul + "]";
	}

}

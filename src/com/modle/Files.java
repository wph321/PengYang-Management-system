/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author admin 2018��4��24������4:08:30
 */
public class Files implements Serializable {

	private int id;
	// �ļ���ַ
	private String address;
	// �ļ���
	private String name;
	// �ļ���С
	private int size;
	// �ϴ���
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

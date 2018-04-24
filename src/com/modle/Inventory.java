/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author admin
 * 2018��4��24������4:12:03
 */
public class Inventory implements Serializable {

	private int id;
//	��Ʒ��+�ͺ�
	private String name;
//	����
	private int number;
	
	public Inventory(int id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public Inventory() {
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
}

/**
 * 
 */
package com.modle;

import java.io.Serializable;

/**
 * @author wph 2018��4��24������4:04:56
 */
public class Positions implements Serializable {

	private int id;
	// ְλ����
	private String position;
	// ��������
	private Dapartment dapartment;

	public Positions(int id, String position, Dapartment dapartment) {
		super();
		this.id = id;
		this.position = position;
		this.dapartment = dapartment;
	}

	public Positions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Dapartment getDapartment() {
		return dapartment;
	}

	public void setDapartment(Dapartment dapartment) {
		this.dapartment = dapartment;
	}

	@Override
	public String toString() {
		return "Positions [id=" + id + ", position=" + position + ", dapartment=" + dapartment + "]";
	}

}

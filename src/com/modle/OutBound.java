/**
 * 
 */
package com.modle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author admin
 * 2018年4月24日下午4:14:49
 */
public class OutBound implements Serializable {

	private int id;
//	名称
	private String name;
//	借出人
	private UserMessage um;
//	状态
	private String date;
//	数量
	private int number;
//	用途
	private String used;
//	时间
	private Date time;
//	备注
	private String note;

	public OutBound(int id, String name, UserMessage um, String date, int number, String used, Date time, String note) {
		super();
		this.id = id;
		this.name = name;
		this.um = um;
		this.date = date;
		this.number = number;
		this.used = used;
		this.time = time;
		this.note = note;
	}

	public OutBound() {
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

	public UserMessage getUm() {
		return um;
	}

	public void setUm(UserMessage um) {
		this.um = um;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "OutBound [id=" + id + ", name=" + name + ", um=" + um + ", date=" + date + ", number=" + number
				+ ", used=" + used + ", time=" + time + ", note=" + note + "]";
	}
	
}

/**
 * 
 */
package com.modle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wph 2018年4月24日下午4:34:29
 */
public class MonthTime implements Serializable {

	private int id;
	// 总时长
	private int bothtime;
	// 统计时间
	private Date statistical;
	// 被统计人
	private UserMessage um;

	public MonthTime(int id, int bothtime, Date statistical, UserMessage um) {
		super();
		this.id = id;
		this.bothtime = bothtime;
		this.statistical = statistical;
		this.um = um;
	}

	public MonthTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBothtime() {
		return bothtime;
	}

	public void setBothtime(int bothtime) {
		this.bothtime = bothtime;
	}

	public Date getStatistical() {
		return statistical;
	}

	public void setStatistical(Date statistical) {
		this.statistical = statistical;
	}

	public UserMessage getUm() {
		return um;
	}

	public void setUm(UserMessage um) {
		this.um = um;
	}

	@Override
	public String toString() {
		return "MonthTime [id=" + id + ", bothtime=" + bothtime + ", statistical=" + statistical + ", um=" + um + "]";
	}

}

/**
 * 
 */
package com.modle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wph 2018��4��24������3:55:07
 */
public class UserMessage implements Serializable {

	private int id;

	// ����
	private String name;
	// �Ա�
	private String sex;
	// ����
	private int age;
	// �绰
	private String telephone;
	// סַ
	private String address;
	// ����id
	private Dapartment dapartment;
	// �˻�id
	private UserLogin userlogin;
	// ״̬
	private String state;
	// ��ְʱ��
	private Date working_data;
	// ��ְʱ��
	private Date departure_time;
	// ��ע
	private String note;

	public UserMessage(int id, String name, String sex, int age, String telephone, String address,
			Dapartment dapartment, UserLogin userlogin, String state, Date working_data, Date departure_time,
			String note) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.telephone = telephone;
		this.address = address;
		this.dapartment = dapartment;
		this.userlogin = userlogin;
		this.state = state;
		this.working_data = working_data;
		this.departure_time = departure_time;
		this.note = note;
	}

	public UserMessage() {
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dapartment getDapartment() {
		return dapartment;
	}

	public void setDapartment(Dapartment dapartment) {
		this.dapartment = dapartment;
	}

	public UserLogin getUserlogin() {
		return userlogin;
	}

	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getWorking_data() {
		return working_data;
	}

	public void setWorking_data(Date working_data) {
		this.working_data = working_data;
	}

	public Date getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "UserMessage [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", telephone=" + telephone
				+ ", address=" + address + ", dapartment=" + dapartment + ", userlogin=" + userlogin + ", state="
				+ state + ", working_data=" + working_data + ", departure_time=" + departure_time + ", note=" + note
				+ "]";
	}

}

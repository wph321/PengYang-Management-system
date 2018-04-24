/**
 * 
 */
package com.modle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wph
 * 2018年4月24日下午4:24:56
 */
public class RawMaterialsInStorage implements Serializable {

//	编号
	private int id;
//	生产批号
	private int production_batch;
//	名称
	private String name;
//	型号
	private String modle;
//	供应单位
	private String supply;
//	进货日期
	private Date in_date;
//	进货数量
	private int in_number;
//	检验数量
	private int check_number;
//	验证方式
	private String check_way;
//	验证项目
	private String check_project;
//	标准要求
	private String check_standard;
//	验证结果
	private String check_result;
//	是否合格（只允许传入‘YES’或者‘NO’）
	private String check_pass;
//	验证结论
	private String check_conclusion;
//	检验员
	private UserMessage um;
//	检验日期
	private Date check_time;
//	不合格处置
	private String unqualified_way;

	public RawMaterialsInStorage(int id, int production_batch, String name, String modle, String supply, Date in_date,
			int in_number, int check_number, String check_way, String check_project, String check_standard,
			String check_result, String check_pass, String check_conclusion, UserMessage um, Date check_time,
			String unqualified_way) {
		super();
		this.id = id;
		this.production_batch = production_batch;
		this.name = name;
		this.modle = modle;
		this.supply = supply;
		this.in_date = in_date;
		this.in_number = in_number;
		this.check_number = check_number;
		this.check_way = check_way;
		this.check_project = check_project;
		this.check_standard = check_standard;
		this.check_result = check_result;
		this.check_pass = check_pass;
		this.check_conclusion = check_conclusion;
		this.um = um;
		this.check_time = check_time;
		this.unqualified_way = unqualified_way;
	}

	public RawMaterialsInStorage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduction_batch() {
		return production_batch;
	}

	public void setProduction_batch(int production_batch) {
		this.production_batch = production_batch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModle() {
		return modle;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public Date getIn_date() {
		return in_date;
	}

	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}

	public int getIn_number() {
		return in_number;
	}

	public void setIn_number(int in_number) {
		this.in_number = in_number;
	}

	public int getCheck_number() {
		return check_number;
	}

	public void setCheck_number(int check_number) {
		this.check_number = check_number;
	}

	public String getCheck_way() {
		return check_way;
	}

	public void setCheck_way(String check_way) {
		this.check_way = check_way;
	}

	public String getCheck_project() {
		return check_project;
	}

	public void setCheck_project(String check_project) {
		this.check_project = check_project;
	}

	public String getCheck_standard() {
		return check_standard;
	}

	public void setCheck_standard(String check_standard) {
		this.check_standard = check_standard;
	}

	public String getCheck_result() {
		return check_result;
	}

	public void setCheck_result(String check_result) {
		this.check_result = check_result;
	}

	public String getCheck_pass() {
		return check_pass;
	}

	public void setCheck_pass(String check_pass) {
		this.check_pass = check_pass;
	}

	public String getCheck_conclusion() {
		return check_conclusion;
	}

	public void setCheck_conclusion(String check_conclusion) {
		this.check_conclusion = check_conclusion;
	}

	public UserMessage getUm() {
		return um;
	}

	public void setUm(UserMessage um) {
		this.um = um;
	}

	public Date getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Date check_time) {
		this.check_time = check_time;
	}

	public String getUnqualified_way() {
		return unqualified_way;
	}

	public void setUnqualified_way(String unqualified_way) {
		this.unqualified_way = unqualified_way;
	}

	@Override
	public String toString() {
		return "RawMaterialsInStorage [id=" + id + ", production_batch=" + production_batch + ", name=" + name
				+ ", modle=" + modle + ", supply=" + supply + ", in_date=" + in_date + ", in_number=" + in_number
				+ ", check_number=" + check_number + ", check_way=" + check_way + ", check_project=" + check_project
				+ ", check_standard=" + check_standard + ", check_result=" + check_result + ", check_pass=" + check_pass
				+ ", check_conclusion=" + check_conclusion + ", um=" + um + ", check_time=" + check_time
				+ ", unqualified_way=" + unqualified_way + "]";
	}
	
}

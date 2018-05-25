/**
 * 
 */
package com.crud.dao;

import java.util.List;
import java.util.Map;

import com.modle.Dapartment;

/**
 * @author wph
 * 2018年4月24日下午7:54:35
 */
public interface DapartmentDao {

	public Dapartment findById(int id) throws Exception;
	
	public Dapartment findByName(String name) throws Exception;
	
	public List<Dapartment> pageFindAll(Map param) throws Exception;
	
	public void add(Dapartment da) throws Exception;
	 
	public void update(Dapartment da) throws Exception;
	
	public void deleteById(int id) throws Exception;
	
	public void Count() throws Exception;
}

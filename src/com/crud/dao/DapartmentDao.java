/**
 * 
 */
package com.crud.dao;

import java.util.List;

import com.modle.Dapartment;

/**
 * @author wph
 * 2018年4月24日下午7:54:35
 */
public interface DapartmentDao {

	public Dapartment findById() throws Exception;
	
	public Dapartment findByName() throws Exception;
	
	public List<Dapartment> findAll() throws Exception;
	
	public void add(Dapartment da) throws Exception;
	
	public void update(Dapartment da) throws Exception;
	
	public void deleteById(int id) throws Exception;
	
}

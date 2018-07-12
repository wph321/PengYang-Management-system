/**
 * 
 */
package com.crud.dao;

import java.util.List;
import java.util.Map;

import com.modle.Inventory;

/**
 * @author wei
 * 2018年5月28日上午10:44:55
 */
public interface InventoryDao {

	public List<Inventory> findBypage(Map param) throws Exception;
	
	public Inventory findById(int id) throws Exception;
	
	public void add(Inventory in) throws Exception;
	
	public void update(Inventory in) throws Exception;
	
	public void delete(int id) throws Exception;
	
	
}

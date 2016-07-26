package com.niit.shopback.DAO;
import java.util.List;

import com.niit.shopback.model.Supplier;
public interface SupplierDAO {
	
	public List<Supplier>list(); 
	public Supplier get(String Id);
	public void saveOrUpdate(Supplier supplier);
	public void delete(String Id);
}


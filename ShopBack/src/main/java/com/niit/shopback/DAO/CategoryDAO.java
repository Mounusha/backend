package com.niit.shopback.DAO;
import java.util.List;

import com.niit.shopback.model.Category;


public interface CategoryDAO {
	
	public List<Category> list(); 
	public Category get(String Id);
	public void saveOrUpdate(Category category);
	public void delete(String Id);
}


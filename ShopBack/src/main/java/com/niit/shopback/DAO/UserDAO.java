package com.niit.shopback.DAO;
import java.util.List;

import com.niit.shopback.model.User;
public interface UserDAO {
	
	public List<User>list(); 
	public User get(String Id);
	public void saveOrUpdate(User user);
	public void delete(String Id);
}


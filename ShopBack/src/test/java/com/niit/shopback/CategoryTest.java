package com.niit.shopback;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopback.DAO.CategoryDAO;
import com.niit.shopback.model.Category;


public class CategoryTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopback");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("TAB_001");
		category.setName("Tablet1");
		category.setDescription("Tablet product2");
		categoryDAO.saveOrUpdate(category);
		
		categoryDAO.delete("CAT_1");
		categoryDAO.get("CAT_1");
		List<Category>list = categoryDAO.list();
		
		for(Category cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
		}
		context.close();
		
	}
}

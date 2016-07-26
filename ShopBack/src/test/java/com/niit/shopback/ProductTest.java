package com.niit.shopback;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopback.DAO.ProductDAO;
import com.niit.shopback.model.Product;

public class ProductTest {
		public static void main(String[] args) 
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shopback");
			context.refresh();
			ProductDAO productDAO =(ProductDAO)context.getBean("productDAO");
			Product product = (Product)context.getBean("product");
			product.setId("Pro1");
			product.setName("Doll");
			product.setDescription("Cute");
			product.setPrice("600");
			productDAO.saveOrUpdate(product);
			
			productDAO.delete("Pro_1");
			productDAO.get("Pro_1");
			List<Product>list = productDAO.list();
			for(Product Pro : list)
			{
				System.out.println(Pro.getId()  + ":" +  Pro.getName()  + ":"+  Pro.getDescription() +":"+ Pro.getPrice());
			}
			context.close();
			
		}
	}


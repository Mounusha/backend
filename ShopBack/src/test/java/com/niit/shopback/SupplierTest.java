package com.niit.shopback;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopback.DAO.SupplierDAO;
import com.niit.shopback.model.Supplier;

public class SupplierTest {
		public static void main(String[] args) 
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shopback");
			context.refresh();
			SupplierDAO supplierDAO =(SupplierDAO)context.getBean("supplierDAO");
			Supplier supplier = (Supplier)context.getBean("supplier");
			supplier.setId("Sup2");
			supplier.setName("vinni");
			supplier.setAddress("Hyderabad");
			supplierDAO.saveOrUpdate(supplier);
			
			supplierDAO.delete("Sup_1");
			supplierDAO.get("Sup_1");
			List<Supplier>list = supplierDAO.list();
			for(Supplier Sup : list)
			{
				System.out.println(Sup.getId()  + ":" +  Sup.getName()  + ":"+  Sup.getAddress());
			}
			context.close();
			
		}
	}


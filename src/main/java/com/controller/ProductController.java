package com.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.ProductBean;
import com.config.Config;
import com.dao.ProductDao;

public class ProductController {

	public static void main(String[] args) {

		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		//ProductDao productDao =new ProductDao();
		ProductDao productDao = (ProductDao)ctx.getBean("productDao");
		ProductBean productBean = new ProductBean();
		productBean.setName("iphone");
		productBean.setPrice(1200);
		int res = productDao.addProduct(productBean);
		if(res>0) {
			System.out.println("product added..");
		}
		else {
			System.out.println("product not added..");
		}
		
		List<ProductBean>products = productDao.getAllProducts();
		for(ProductBean pbean :products) {
			
			System.out.println(pbean.getId());
		}

	}
}

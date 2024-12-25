package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.ProductBean;

@Repository("productDao")
public class ProductDao {

	@Autowired // if not null
	JdbcTemplate jdbcTemplate;

	public int addProduct(ProductBean productBean) {

		return jdbcTemplate.update("insert into products(pname,pprice)values(?,?)", productBean.getName(),
				productBean.getPrice());
		// pres....
	}
}

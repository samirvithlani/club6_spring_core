package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public int deleteProduct(int id) {

		return jdbcTemplate.update("delete from products where pid =?", id);
	}

	public List<ProductBean> getAllProducts() {

		return jdbcTemplate.query("select * from products", new ProductMapper());

	}
	
	public ProductBean getProductById(int id) {
		
		return jdbcTemplate.queryForObject("select * from products where pid ="+id+"", new ProductMapper());
	}

	public final class ProductMapper implements RowMapper<ProductBean> {

		@Override
		public ProductBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			ProductBean productBean = new ProductBean();
			productBean.setId(rs.getInt("pid"));
			productBean.setName(rs.getString("pname"));
			productBean.setPrice(rs.getInt("pprice"));
			return productBean;
		}

	}
}

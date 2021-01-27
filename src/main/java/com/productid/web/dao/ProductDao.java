package com.productid.web.dao;

import java.sql.DriverManager;
import java.sql.*;

import com.productid.web.model.product;

public class ProductDao {
    public product getProduct(int id){
        product a = new product();
//        a.setId(5);
//        a.setName("coke");
//        a.setPrice(2.55);

        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "password");
        	Statement st = con.createStatement();
        	ResultSet rs  = st.executeQuery("select * from products where id=" + id);
        	if(rs.next()) {
        		a.setId(rs.getInt("id"));
        		a.setName(rs.getString("name"));
        		a.setPrice(rs.getDouble("price"));
        	}
        	
        }catch(Exception e) {
        	System.out.println(e);
        }
        
        
        return a;
    }
}

package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;

public class ProductMapper implements IRowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs) {
		try {
			return new Product(
					rs.getInt("product_id"),
					rs.getString("product_name"),
					rs.getString("product_des"),
					rs.getFloat("product_price"),
					rs.getString("product_img_source"),
					rs.getString("product_type"),
					rs.getString("product_brand")
				);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int count(ResultSet rs) {
		try {
			rs.next();
			return rs.getInt(specificCol);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	String specificCol;
	public String getSpecificCol() {
		return specificCol;
	}
	public void setSpecificCol(String specificCol) {
		this.specificCol = specificCol;
	}
	
}

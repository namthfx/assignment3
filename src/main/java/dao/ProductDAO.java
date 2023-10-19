package dao;
import java.util.List;

import mapper.ProductMapper;
import model.Product;

public class ProductDAO extends GenericDaoIpml<Product> implements IProductDAO {
	@Override
	public List<Product> search(String character){
		String sql = "select * from products p where p.product_name LIKE '?%'";
		return query(sql , new ProductMapper(),character );
	}

	@Override
	public Product getProduct(String character) {
		String sql = "select * from products p where p.product_name = '?'";
		return query(sql , new ProductMapper(),character ).get(0);
	}

	@Override
	public Product findById(Integer i) {
		String sql = "select * from products p where p.product_id = '?'";
		return query(sql , new ProductMapper(),i ).get(0);
	}
	
	
}

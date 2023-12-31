package dao;
import java.util.List;

import mapper.ProductMapper;
import model.Product;
import pagable.Pagable;

public class ProductDAO extends GenericDaoIpml<Product> implements IProductDAO {
	@Override
	public List<Product> search(String character){
		String sql = "SELECT * FROM products p WHERE p.product_name LIKE '%" + character +"%'";
		return query(sql , new ProductMapper(),character );
	}
	@Override
	public List<Product> getAll(){
		String sql = "SELECT * FROM products p";
		return query(sql , new ProductMapper() );
	}
	@Override
	public Product findByName(String character) {
		String sql = "select * from products p where p.product_name = '"+ character +"'";
		return query(sql , new ProductMapper(),character ).get(0);
	}

	@Override
	public Product findById(Integer i) {
		String sql = "select * from products p where p.product_id = '"+ i +"'";
		return query(sql , new ProductMapper(),i ).get(0);
	}
	@Override
	public List<Product> OrderByPage(String character, Pagable pagable) {
		int offset = pagable.getPage()* 6;
		String sql = "select * from products p where p.product_name LIKE '%"+ character +"%' limit 6 offset " + offset;
		return query(sql , new ProductMapper());
	}
	@Override
	public int count(String character) {
		String sql = "SELECT count(*) FROM products p where p.product_name LIKE '%" + character +"%'";
		ProductMapper pm = new ProductMapper();
		pm.setSpecificCol("count(*)");
		return countQuery(sql , pm);
	}
	
	
}

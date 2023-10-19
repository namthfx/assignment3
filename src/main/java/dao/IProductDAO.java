package dao;

import java.util.List;

import model.Product;

public interface IProductDAO extends GenericDAO<Product> {
	List<Product> search(String character);
	Product getProduct(String character);
	Product findById(Integer i);

}

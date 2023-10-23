package dao;

import java.util.List;

import model.Product;
import pagable.Pagable;

public interface IProductDAO extends GenericDAO<Product> {
	List<Product> search(String character);
	Product findByName(String character);
	Product findById(Integer i);
	List<Product> getAll();
	
	List<Product> OrderByPage(String character, Pagable pagable);
	int count(String character); 
}

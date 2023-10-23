package service;
import java.util.List;


import model.Product;
import pagable.Pagable;
public interface IProductService {
	List<Product> search(String character);
	 Product findById(Integer i);
	 Product findByName(String name);
	int count(String name);
	List<Product> getAll();
	List<Product> OrderByPage(String character, Pagable pagable);
}

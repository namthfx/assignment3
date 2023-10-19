package service;
import java.util.List;


import model.Product;
public interface IProductService {
	List<Product> search(String character);
	 Product findById(Integer i);
	 Product getProduct(String name);
	 
}

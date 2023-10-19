package service;

import java.util.List;

import dao.IProductDAO;
import dao.ProductDAO;
import model.Product;

public class ProductService implements IProductService{
	private final IProductDAO productDAO = new ProductDAO();
	
	public List<Product> search(String character){
		return productDAO.search(character);
	}
	
	public Product findById(Integer i){
		return productDAO.findById(i);
	}
	public Product getProduct(String name){
		return productDAO.getProduct(name);
	}	
}

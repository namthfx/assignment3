package service;

import java.util.List;

import dao.IProductDAO;
import dao.ProductDAO;
import model.Product;
import pagable.Pagable;

public class ProductService implements IProductService{
	private final IProductDAO productDAO = new ProductDAO();
	
	public List<Product> search(String character){
		return productDAO.search(character);
	}
	
	public List<Product> getAll(){
		return productDAO.getAll();
	}
	
	public Product findById(Integer i){
		return productDAO.findById(i);
	}
	public Product findByName(String name){
		return productDAO.findByName(name);
	}	
	public int count(String name) {
		return productDAO.count(name);

	}
	
	public List<Product> OrderByPage(String character, Pagable pagable){
		return productDAO.OrderByPage(character, pagable);
	}
}

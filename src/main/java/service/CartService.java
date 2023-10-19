package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dao.IOrderDAO;
import dao.IProductOrdersDAO;
import dao.OrderDAO;
import dao.ProductOrdersDAO;
import model.Cart;
import model.Order;
import model.Product;
import model.ProductOrders;

public class CartService implements ICartService {
	private IOrderDAO orderDAO;
	private IProductOrdersDAO productOrderDAO ;
	public CartService() {
		this.orderDAO = orderDAO = new OrderDAO();
		this.productOrderDAO = productOrderDAO = new ProductOrdersDAO();
	}
	public boolean saveCart(Order o, Cart c) {
		int orderId = orderDAO.insert(o);
		Map<Product, Integer> map = new HashMap<>(); 
		for(Product p: c.getItems()) {
			if(map.get(p)!= null ) {
				map.put(p, map.get(p)+1);
			}else {
				map.put(p, 1);
			}
		}
		Set<Product> setProduct= map.keySet();
		for(Product p : setProduct) {
			int amount = map.get(p);
			productOrderDAO.insert(new ProductOrders(orderId, p.getId(), map.get(p)), amount*o.getDiscount()*p.getPrice());
		}
		return true;
	}
}

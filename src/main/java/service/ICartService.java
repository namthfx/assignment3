package service;

import model.Cart;
import model.Order;

public interface ICartService {
	boolean saveCart(Order o, Cart c);
}

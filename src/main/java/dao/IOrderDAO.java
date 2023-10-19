package dao;


import model.Order;

public interface IOrderDAO extends GenericDAO<Order>{
	Integer insert(Order order);
}

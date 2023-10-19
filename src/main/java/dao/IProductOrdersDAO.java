package dao;

import model.ProductOrders;

public interface IProductOrdersDAO extends GenericDAO<ProductOrders>{
	Integer insert(ProductOrders p, float totalAmount) ;
}

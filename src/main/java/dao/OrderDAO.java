package dao;

import model.Order;

public class OrderDAO extends GenericDaoIpml<Order> implements IOrderDAO{

	@Override
	public Integer insert(Order order) {
		String sql = "INSERT INTO orders (user_mail, order_id, order_status, order_date, order_discount_code, order_address) "
				+ "VALUES(? , ? , ? , ? , ? , ?)" ;
		return insert(sql, order.getUserMail(),order.getOrderId(),order.getStatus(), order.getOrderDate(),order.getDiscount(),order.getAddress());
	}
		
}

package dao;


import model.ProductOrders;
public class ProductOrdersDAO extends GenericDaoIpml<ProductOrders> implements IProductOrdersDAO {
	IProductDAO iproductDao;
	
	@Override
	public Integer insert(ProductOrders p, float totalAmount) {
		String sql = "INSERT INTO orders_detail ( order_id, product_id,amount_product , price_product) "
				+ "VALUES(? , ? , ? , ? )" ;
		return insert(sql,p.getOrderId(), p.getProductId(),p.getAmountProduct(), totalAmount);
	}


}

package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import context.DBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.Session;
import model.Product;
import pagable.Pagable;
import service.IProductService;
import service.ProductService;

@WebServlet("")
public class HomeController extends HttpServlet {
	IProductService prooductService = new ProductService();
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		Pagable page = new Pagable(0);
		page.setNum(6);
		List<Product> ps = prooductService.OrderByPage("",page);
//		
//		Product p = prooductService.findByName("iPhone Xs Max 256GB");
//		Product n = prooductService.findById(1);
		int count = prooductService.count("");
		for(Product p : ps)
			System.out.print(p.toString());
		response.sendRedirect("home.jsp");
	}
}

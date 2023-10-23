package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pagable.Pagable;
import service.IProductService;
import service.ProductService;
@WebServlet("/product")

public class ProductController  extends HttpServlet{
	/**
	 * 
	 */
	IProductService productService = new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final int num = 6;
		String  page = request.getParameter("page");
		String orderBy = request.getParameter("orderBy");
		if(parseArg(page)!= null && orderBy!= null  ) {
			Pagable pageable;
			if (orderBy== null)
				pageable = new Pagable(parseArg(page));
			else
				pageable = new Pagable(parseArg(page),orderBy);
			
		}
		if(request.getParameter("id")!=null) {
			processParamRequest(request.getParameter("name"));
			
		}	
		else if(request.getParameter("name")!=null) {
			processParamRequest(request.getParameter("name"));	
		}
		
		response.sendRedirect("product.jsp");
		
	}
	
	protected void processParamRequest(String character) {
		productService.findByName(character);
	}
	protected void processParamRequest(Integer id) {
		productService.findById(id);
	}
	
	private Integer parseArg(String i) {
		try {
			return Integer.parseInt(i);
		}catch(NumberFormatException e) {
			return null;
		}
	}
}

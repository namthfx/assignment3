package controller;

import java.io.IOException;
import java.sql.Connection;

import context.DBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.Session;

@WebServlet("")
public class HomeController extends HttpServlet {
	DBcontext dbctx; 
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		dbctx = new DBcontext();
		
		try {
			Connection connection = dbctx.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

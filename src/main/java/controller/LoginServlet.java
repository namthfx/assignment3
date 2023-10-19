package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Account> accounts ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	try {
    		request.getSession(true).invalidate();
    		
    		String regexEmail ="[A-Z0-9._a-z]+@[A-Z0-9\\.a-z]+\\.[A-Z]{2,6}";
    		String regexPassword = "[a-zA-Z0-9_!@#$%^&*]+";
    		
    		String user = request.getParameter("username");
    		String password = request.getParameter("password");
    		Account acc = new Account();
    		acc.setName(user);
    		acc.setPwd(password);
    		HttpSession session = request.getSession(true);
    		
    		if(!password.matches(regexPassword)|| user.matches(regexEmail)) {
    			session.setAttribute("error", "invalid syntax");
    			response.sendRedirect("login.jsp");
    		}
    		String uid = getServletContext().getInitParameter("username");
    		String pwd = getServletContext().getInitParameter("password");
    		
    		if(user!=null && acc.getName().equalsIgnoreCase(uid)  && acc.getPwd().equals(pwd) ) {
    			accounts = new ArrayList<>();
    			accounts.add(new Account("nam trinh",  "null", 1, "nam", "vo thi sau", "090920392", 1));
    			accounts.add(new Account("nam 3123",  "null", 2, "3432", "vo thi sau", "22231", 1));
    			accounts.add(new Account("nam 32",  "333", 2, "412", "vo thi sau", "090920392", 1));
    			session.setAttribute("user", user);
    			session.setAttribute("account1", accounts.get(0));
    			session.setAttribute("account2", accounts.get(1));
    			response.sendRedirect("admin/index.jsp");
    			
    		}else {
    			session.setAttribute("error", "wrong username or password");
    			response.sendRedirect("login.jsp");
    		}
    		
    	}catch(NullPointerException e ) {
    		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    	}catch(Exception ex) {
    		response.getWriter().println(ex);
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}

package com.org.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.entity.User;

@WebServlet("/adminLogin")
public class AdminLogin  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
//	UserDao dao = new UserDao();
//	User u = dao.logIn(email, password);
	HttpSession hs = req.getSession();
	if("admin@gmail.com".equals(email)&&"admin".equals(password)) {
		//System.out.println("login success");
		hs.setAttribute("adminObj", new User());
		resp.sendRedirect("admin/index.jsp");
		
	}else {
		//System.out.println("login fail");
		hs.setAttribute("errorMsg", "invalid user or password");
		resp.sendRedirect("admin_login.jsp");
	}
}
}

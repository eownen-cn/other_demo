package com.denny.jsptest.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.denny.jsptest.service.StudentService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService service = null ;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf8");
		service = new StudentService() ;
		// 獲取登錄用戶的登陸名和密碼
		String loginName = request.getParameter("loginName") ;
		String loginPass = request.getParameter("loginPass") ;
		// 驗證登錄名和密碼的合法性
		// 驗證失敗,重定向到登陸頁面重新登陸
		if (! service.checkUser(loginName,loginPass) ) {
			response.sendRedirect("/login.jsp");
			return ;
		}
		// 驗證成功,進一步交給業務層處理判斷登錄名和密碼是否匹配
		if (service.loginning(loginName, loginPass)) {
			System.out.println("登錄成功!");
			request.setAttribute("sname", loginName);
			request.getRequestDispatcher("/index.jsp").forward(request, response) ;
		} else {// 匹配失敗,重定向到注冊頁面
			response.sendRedirect(request.getContextPath() + "/register.jsp");
		}
	}

}

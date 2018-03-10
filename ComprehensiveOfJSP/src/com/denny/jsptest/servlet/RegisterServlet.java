package com.denny.jsptest.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.denny.jsptest.service.StudentService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService service = null ;
	
	@Override
	public void init() throws ServletException {
		System.out.println("init------------------------");
		super.init();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.err.println("doPost-------------");
		request.setCharacterEncoding("utf8");
		service = new StudentService() ;
		// 獲取請求參數
		String uname = request.getParameter("sname") ; // 獲取用戶名
		String loginName = request.getParameter("loginName") ; // 獲取登錄名
		String loginPass = request.getParameter("loginPass") ; // 獲取密碼
		// 驗證合法性
		if (!service.checkUser(loginName, loginPass)) { // 驗證失敗,重新注冊
			System.err.println("注冊失敗,返回重新注冊!");
			response.sendRedirect(request.getContextPath()+ "/register.jsp");
			return ;
		} else { // 驗證成功,執行插入
			
			if ( service.addStudent(uname,loginName,loginPass) ) {// 插入成功,跳轉到登陸頁面
				System.err.println("注冊成功,跳轉到首頁!");
				request.getSession().setAttribute("sname", loginName);
				request.setAttribute("msg", "注冊成功!");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else {// 插入失敗,跳轉到注冊頁面重新注冊,並提示信息!
				request.setAttribute("msg", "很抱歉,注冊失敗,請重新注冊!");
			}
		}
	}

}

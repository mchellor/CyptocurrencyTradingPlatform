package com.traderjoey.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 暂时先完成两个功能:
 * 1.客户端跳转到fan已做的k线图
 * 2.打印输出login.jsp传过来的参数
 * @author lican
 *
 */
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// FIXME fan
		super.doPost(req, resp);
	}
}

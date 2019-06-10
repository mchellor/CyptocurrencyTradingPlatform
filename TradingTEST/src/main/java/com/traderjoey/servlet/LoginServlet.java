package com.traderjoey.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定两个测试用户,后续和数据库连接后,再取真正的用户来检查:
 * 1.admin/traderjoey123-
 * 2.root/traderjoey123-
 * 
 * 暂时先完成两个功能:
 * 1.若index.jsp传过来的用户名密码不匹配测试用户,则回到index.jsp
 * 2.若用户名密码匹配测试用户,则客户端跳转到fan已做的k线图:query.jsp
 * 
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

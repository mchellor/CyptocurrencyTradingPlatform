package com.traderjoey.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckLoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	/**
	 * 为了避免有人绕过咱们设计的机制:必须登录才能用,设计了此filter用于检查当前用户:
	 * 1.如果其为非空,则不采取任何行动
	 * 2.如果其为空,检查当前的以jsp结尾的url,如果这个url不是以index.jsp或者register.jsp结尾,则使用客户端跳转到index.jsp
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// FIXME fan
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

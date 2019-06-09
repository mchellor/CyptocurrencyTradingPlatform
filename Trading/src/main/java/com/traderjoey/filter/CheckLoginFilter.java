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
	 * 过滤所有的以jsp结尾的url,如果不是以login.jsp或者register.jsp结尾,则使用客户端跳转到login.jsp
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

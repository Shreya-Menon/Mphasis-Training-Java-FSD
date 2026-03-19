package com.test;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/Login")
public class MyFilter extends HttpFilter {
	private static final long serialVersionUID=1L;
	public void destroy() {
	System.out.println("filter destroy()");
	}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
	System.out.println("before servlet");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("after servlet");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init()");
			}

}

package com.itheima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 1.放行前，对request数据进行处理，respone没有数据
        System.out.println("1.FilterDemo。。。。");

        // 放行
        filterChain.doFilter(servletRequest,servletResponse);

        // 3.放行后，对 respone 数据进行处理
        System.out.println("3.filter demo");
    }

    @Override
    public void destroy() {

    }
}

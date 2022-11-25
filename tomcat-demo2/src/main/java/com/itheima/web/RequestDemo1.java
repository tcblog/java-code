package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求方式
        String method = req.getMethod();
        System.out.println(method);
        // 获取虚拟目录（项目的访问路径）
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        // 获取url
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL.toString());
        // 获取uri统一资源标识符
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //  获取请求参数（GET方式）
        String queryString = req.getQueryString();
        System.out.println(queryString);

        // 获取请求头  user-agent：浏览器版本信息
        String header = req.getHeader("user-agent");
        System.out.println(header);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取post的请求体：请求参数

        // 1.获取字符输入流
        BufferedReader reader = req.getReader();

        //2.读取数据
        String line = reader.readLine();
        System.out.println(line);
    }
}

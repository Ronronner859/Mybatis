package com.java.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//目录匹配
@WebServlet(urlPatterns = "*.do")
public class ServletDemo8 extends myHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get>>>>>>>8");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post");
    }
}

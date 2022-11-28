package com.java.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//目录匹配
@WebServlet(urlPatterns = "/user/*")
public class ServletDemo7 extends myHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get>>>>>>>7");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post");
    }
}

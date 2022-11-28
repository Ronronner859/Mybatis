package com.java.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//任意匹配
//@WebServlet(urlPatterns = "/*")
public class ServletDemo10 extends myHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get>>>>>>>10");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post");
    }
}

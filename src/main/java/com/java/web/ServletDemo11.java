package com.java.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletDemo11 extends myHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get>>>>>>>11");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post");
    }
}

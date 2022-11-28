package com.java.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns ={ "/demo6","/demo7"})
public class ServletDemo6 extends myHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get>>>>>>>");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post");
    }
}

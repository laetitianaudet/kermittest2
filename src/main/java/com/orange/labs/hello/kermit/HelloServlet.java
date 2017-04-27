package com.orange.labs.hello.kermit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Hello Servlet", urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {

    private String maVariable;

    public HelloServlet() {
        this.maVariable = System.getenv("MA_VARIABLE");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("maVariable", this.maVariable);
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
    }
}

package com.microsamples.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "links", urlPatterns = { "/links" })
@Slf4j
public class LinkController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Forwarding to jsp");

//        RegisterDetails details = new RegisterDetails();
//        details.setName(request.getParameter("FullName"));
//        details.setEmail(request.getParameter("EmailAddress"));
//        details.setPassword(request.getParameter("Password"));
//        details.setUsername(request.getParameter("Username"));
//        request.setAttribute("details", details);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

//    private void dbstuff(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");
//
//        DataSource dataSource = (DataSource) getServletContext().getAttribute("DataSource");
//
//        PreparedStatement ps = null;
//        try {
//            Connection con = dataSource.getConnection();
//            ps = con.prepareStatement("insert into Users(name,email,country, password) values (?,?,?,?)");
//            ps.setString(1, name);
//            ps.setString(2, email);
//            ps.setString(3, country);
//            ps.setString(4, password);
//
//            ps.execute();
//
//            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
//            PrintWriter out= response.getWriter();
//            out.println("<font color=green>Registration successful, please login below.</font>");
//            rd.include(request, response);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            log.error("Database connection problem");
//            throw new ServletException("DB Connection problem.");
//        }finally{
//            try {
//                ps.close();
//            } catch (SQLException e) {
//                log.error("SQLException in closing PreparedStatement");
//            }
//        }
//    }
}

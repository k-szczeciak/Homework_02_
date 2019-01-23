package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet141")
public class Servlet141 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        for (int i = 0; i < 9; i++) {
            response.getWriter().append("<a href=\"/Servlet142")
                    .append("?id=")
                    .append(String.valueOf(i))
                    .append("\">LInk do Id: ")
                    .append(String.valueOf(i))
                    .append("</a>")
            .append("<br>");
        }

    }
}

package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String path1 = getServletContext().getRealPath("/");
        response.getWriter().append("application path: ").append(path1).append("<br>").append("<br>");
        Path path = Paths.get(path1 + "/oop.txt");

        try{
        for (String line : Files.readAllLines(path)) {
            response.getWriter().append(line).append("<br>");
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}

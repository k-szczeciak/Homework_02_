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


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //setting up charset for displaing the pache with polish characters:
        response.setContentType("text/html; charset=utf-8");

        //getting path for the file:
        // /Users/krzysztofszczeciak/workspace/Homework_02/src/main/java/pl/coderslab/oop.txt <-- path
        // pl/coderslab/oop.txt <-- relative path
        // /Users/krzysztofszczeciak/workspace/Homework_02/target/Homework_02-1.0-SNAPSHOT/ <-- path retrieved form:
        String path1 = getServletContext().getRealPath("/");
        response.getWriter().append("application path: ").append(path1).append("<br>").append("<br>");
        Path path = Paths.get("/Users/krzysztofszczeciak/workspace/Homework_02/src/main/java/pl/coderslab/oop.txt");


        try{
        for (String line : Files.readAllLines(path)) {
            response.getWriter().append(line).append("<br>");
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}

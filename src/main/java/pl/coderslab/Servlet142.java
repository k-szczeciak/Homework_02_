package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet142")
public class Servlet142 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };

        String id = request.getParameter("id");
        int idInt = Integer.parseInt(id);
        if(idInt <= 7 ){
            String[] line = products[idInt].replaceAll("'", "").split(";");

            response.getWriter().append(line[0])
            .append(" - ")
            .append(line[1])
            .append(" zł");
        }else{
            response.getWriter().append("product not found");
        }
    }
}

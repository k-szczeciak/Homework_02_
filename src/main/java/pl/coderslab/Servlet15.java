package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().append("doGet").append("<br><br>");
        response.getWriter().append("unsorted table:");

        ArrayList<Integer> randList = new ArrayList<Integer>();
        int randInt = 0;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            randList.add(rand.nextInt(100));
        }
        response.getWriter().append(displayTable(randList));
        response.getWriter().append("<br>");
        Collections.sort(randList);
        response.getWriter().append("sorted table:");
        response.getWriter().append(displayTable(randList));



    }

    public static String displayTable (ArrayList<Integer> arrayList){
        String result = "";
        result = "<table border = 1px solid black>\n" +
                "    <tr>\n" +
                "        <th>Lp.</th>\n" +
                "        <th>wyl. Liczba</th>\n" +
                "    </tr>\n";
        for (int i = 0; i < arrayList.size(); i++) {
            result += "<tr><td>" + i + "</td><td>" + arrayList.get(i) + "</td></tr>";
        }
        result += "</table>";

        return result;
    }
}

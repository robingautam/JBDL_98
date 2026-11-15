import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class FormData extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside the post method");

        resp.setContentType("text/plain");

        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String username = req.getParameter("username");

        printWriter.println("hey "+name+ " Welcome to the application");
        printWriter.println("Your details has been saved successfully..");
        printWriter.println("Email: "+email);
        printWriter.println("Username: "+username);
    }
}

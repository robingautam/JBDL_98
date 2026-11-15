import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {

   // This method will be called on GET Request
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside the GET Method");
        resp.setContentType("text/plain");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Hi Inside the GET Method !!");
    }

    // This method will be called on POST Request
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
//
//    // This method will be called on PATCH Request
//    @Override
//    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPatch(req, resp);
//    }
//
//    // This method will be called on PUT Request
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req, resp);
//    }
//
//    // This method will be called on DELETE Request
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);
//    }
}

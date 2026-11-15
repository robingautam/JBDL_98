import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet {
    // This method will invoke when servlet start
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet has been initialized");
    }

    // Its used the servlet config
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // This method will execute on every web request
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("inside the service method"); // console printing , not for browser printing, we have not send any data to frontend

       PrintWriter printWriter = servletResponse.getWriter();

       servletResponse.setContentType("text/plain"); // It tells the client, what kind of response sent

       printWriter.println("<h1>Hi My Name is Robin !!, URL has been invoked</h1>");


    }

    // Its for servlet information
    @Override
    public String getServletInfo() {
        return "";
    }

    // this  method will call, when servlet destroy
    @Override
    public void destroy() {
        System.out.println("servlet has been destroyed");
    }
}

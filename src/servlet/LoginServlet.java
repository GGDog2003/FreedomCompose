package servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import POJO.User;
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out= null;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
            out = response.getWriter();
        String username=request.getParameter("username");
        String userpsd=request.getParameter("userpsd");


    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
}
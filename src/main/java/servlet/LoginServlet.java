package servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import POJO.User;
import service.LoginServices;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out= null;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
            out = response.getWriter();
        String username=request.getParameter("loginUserName");
        String userpsd=request.getParameter("loginUserPsd");
        User user=new User(username,userpsd);
        LoginServices loginServices=new LoginServices();
        try {
            boolean canLogin=loginServices.login(user);
            if(canLogin){
                out.println("<h1 style='color:green'>登录成功！<br>欢迎来到乐自由！</h1>");
            }else{
                out.println("<h1 style='color:red'>登录失败！账号或密码错误！</h1>");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
}
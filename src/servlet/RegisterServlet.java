package servlet;

import POJO.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import service.RegisterService;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out= null;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
            out = response.getWriter();

        String username=request.getParameter("registerUserName");
        String userpsd=request.getParameter("registerUserPsd");
        String useremail=request.getParameter("registerUserEmail");
        User user=new User(username,userpsd,useremail);
        out.println("新增用户名："+user.getUserName()+"   新增密码："+user.getUserPsd()+"   新增Email："+user.getUserEmail());
        System.out.println("新增用户名："+user.getUserName()+"   新增密码："+user.getUserPsd()+"   新增Email："+user.getUserEmail());
        RegisterService service=new RegisterService();
        try {
            service.register(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        this.doPost(request,response);
    }
}
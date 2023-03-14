package DAO;

import POJO.User;
import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    Connection connection=null;
    User user;
    public LoginDAO(){}
    public LoginDAO(User user){
        this.user=user;

    }
    public boolean LoginCheck() throws SQLException {
        DBUtils dbUtils=new DBUtils();
        connection=dbUtils.getConection();
        Statement st = connection.createStatement();
        String sql =( "SELECT *FROM remoteuser where remoteUserName='"+user.getUserName()+"' and remoteUserPsd='"+
                user.getUserPsd()+"'");

        ResultSet result=  st.executeQuery(sql);
       if (result.next()){
           return true;
       }else{
           return false;
       }
    }

}

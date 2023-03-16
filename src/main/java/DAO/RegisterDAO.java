package DAO;

import POJO.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDAO {
    Connection connection=null;
    User user;
    public  RegisterDAO(){

    }
    public RegisterDAO(User user){
        this.user=user;
    }
    public void Registe(User user) throws SQLException {
        DAO.DBUtils dbUtils=new DAO.DBUtils();
        connection=dbUtils.getConection();
        Statement st = connection.createStatement();
        String sql = "insert into remoteuser values('"+user.getUserName()+"','"+user.getUserPsd()+"','"+user.getUserEmail()+"');";

        st.execute(sql);
    }
}

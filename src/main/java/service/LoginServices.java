package service;

import DAO.LoginDAO;
import POJO.User;

import java.sql.SQLException;

public class LoginServices implements LoginServicesImpl{
    @Override
    public boolean login(User user) throws SQLException {
        LoginDAO loginDAO=new LoginDAO(user);

        return loginDAO.LoginCheck();
    }



}

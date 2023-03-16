package service;

import DAO.RegisterDAO;
import POJO.User;

import java.sql.SQLException;

public class RegisterService implements RegisterServiceImpl{

    @Override
    public User register(User user) throws SQLException {

        RegisterDAO registerDAO=new RegisterDAO(user);
        registerDAO.Registe(user);

        return user;
    }
}

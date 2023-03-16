package service;

import POJO.User;

import java.sql.SQLException;

public interface RegisterServiceImpl {


    User register(User user) throws SQLException;
}

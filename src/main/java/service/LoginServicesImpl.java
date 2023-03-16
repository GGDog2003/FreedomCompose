package service;

import POJO.User;

import java.sql.SQLException;

public interface LoginServicesImpl {
    boolean login(User user) throws SQLException;
}

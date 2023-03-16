package DAO;

import java.sql.*;
public class DBUtils {
    Connection con;
    public final String  USERNAME="root";
    public final String  PASSWORD="849654649Cjh!";
    public final String URL="jdbc:mysql://8.130.13.72:3306/firstremotedb";

    private void loadDriver(){
        try { // 加载数据库驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConection(){
        loadDriver();
        try{
            con= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

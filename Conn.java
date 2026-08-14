package bank.management.system;

import java.sql.*;

public class Conn {
    public Connection connection;
    public Statement statement;
    public Conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","kashish");
             statement = connection.createStatement();

        } catch (Exception e) {
           e.printStackTrace();
        }


    }
}
package week5.week5_day1.dbexercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","1234" );
        return c;
    }
}

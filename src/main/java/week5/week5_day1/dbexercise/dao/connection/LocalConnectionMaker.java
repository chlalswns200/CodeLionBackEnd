package week5.week5_day1.dbexercise.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","1234" );
        return c;
    }
}

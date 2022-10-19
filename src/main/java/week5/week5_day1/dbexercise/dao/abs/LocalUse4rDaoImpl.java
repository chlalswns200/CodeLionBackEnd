package week5.week5_day1.dbexercise.dao.abs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalUse4rDaoImpl extends UserDaoAbstract{
    @Override
    public Connection makeConnection() throws SQLException {

        Map<String, String> env = System.getenv();

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","1234" );

        return c;
    }
}

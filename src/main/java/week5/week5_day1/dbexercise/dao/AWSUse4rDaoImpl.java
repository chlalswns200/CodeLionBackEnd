package week5.week5_day1.dbexercise.dao;

import week5.week5_day1.dbexercise.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class AWSUse4rDaoImpl extends UserDaoAbstract{
    @Override
    public Connection makeConnection() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Connection c = DriverManager.getConnection(dbHost, dbUser, dbPassword);

        return c;
    }
}

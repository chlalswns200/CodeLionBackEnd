package week5.week5_day1.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

//환경 변수를 통해 id name password를 따로 저장하고 하는 방법

public class UserDao2 {

    public void add() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id,name,password) values(?,?,?)"
        );
        ps.setString(1,"1");
        ps.setString(2,"Minjun2");
        ps.setString(3,"112345");

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public static void main(String[] args) throws SQLException {
        UserDao2 userDao = new UserDao2();
        userDao.add();
    }
}

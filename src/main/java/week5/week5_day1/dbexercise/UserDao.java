package week5.week5_day1.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public void add() throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/likelion-db","root",""
        );

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id,name,password) values(?,?,?)"
                );
        ps.setString(1,"0");
        ps.setString(2,"Minjun");
        ps.setString(3,"1123");

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}

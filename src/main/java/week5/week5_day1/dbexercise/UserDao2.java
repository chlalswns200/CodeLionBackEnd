package week5.week5_day1.dbexercise;

import week5.week5_day1.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

//환경 변수를 통해 id name password를 따로 저장하고 하는 방법

public class UserDao2 {

    public void add(User user) throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id,name,password) values(?,?,?)"
        );
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {

        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                dbHost, dbUser, dbPassword);

        PreparedStatement ps = conn.prepareStatement(
                "select id, name ,password FROM users WHERE id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

        rs.close();
        ps.close();
        conn.close();

        return user;

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao2 userDao = new UserDao2();
        userDao.add(new User("7","Ruru","1234qwer"));

        User user = userDao.get("7");

        System.out.println("user.getName() = " + user.getName());


    }
}

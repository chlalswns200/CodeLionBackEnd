package week5.week5_day1.dbexercise.dao;

import week5.week5_day1.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;


// aws , local db 둘다 사용하기 위한 다형성 적용
public abstract class UserDaoAbstract {

    public abstract Connection makeConnection() throws SQLException;

    public void add(User user) throws SQLException {

        Connection conn = makeConnection();

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

    public User findById(String id) throws SQLException {

        Connection conn = makeConnection();

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

//        UserDaoAbstract userDao = new UserDaoAbstract();
//        userDao.add(new User("7","Ruru","1234qwer"));
//
//        User user = userDao.findById("7");
//
//        System.out.println("user.getName() = " + user.getName());


    }
}

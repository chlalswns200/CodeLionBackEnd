package week5.week5_day1.dbexercise.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import week5.week5_day1.dbexercise.domain.User;

import java.sql.*;

//환경 변수를 통해 id name password를 따로 저장하고 하는 방법

public class UserDao {

    private ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new AwsConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws SQLException {

        Connection conn = connectionMaker.makeConnection();

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

        Connection conn = connectionMaker.makeConnection();

        PreparedStatement ps = conn.prepareStatement(
                "select id, name ,password FROM users WHERE id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        User user = null;
        if (rs.next()) {
            user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        }

        rs.close();
        ps.close();
        conn.close();

        if(user ==null) throw new EmptyResultDataAccessException(1);
        return user;

    }

    public void deleteAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connectionMaker.makeConnection();
            ps = conn.prepareStatement(
                    "DELETE FROM users");
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }

    }

    public int getCount() throws SQLException {
        Connection conn = connectionMaker.makeConnection();
        PreparedStatement ps = conn.prepareStatement(
                "SELECT count(*) from users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int count = rs.getInt(1);

        rs.close();
        ps.close();
        conn.close();
        return count;
    }
}

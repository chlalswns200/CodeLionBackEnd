package week5.week5_day1.dbexercise.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import week5.week5_day1.dbexercise.domain.User;

import javax.sql.DataSource;
import java.sql.*;

//환경 변수를 통해 id name password를 따로 저장하고 하는 방법

public class UserDao {

    private final DataSource dataSource;
    private final JdbcContext jdbcContext;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcContext = new JdbcContext(dataSource);
    }

    public void executeSql(String sql) throws SQLException {
        this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {

            @Override
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
                return c.prepareStatement(sql);
            }
        });
    }

    public void add(User user) throws SQLException {
        jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
                PreparedStatement ps = c.prepareStatement(
                        "INSERT INTO users(id,name,password) values(?,?,?)"
                );
                ps.setString(1,user.getId());
                ps.setString(2,user.getName());
                ps.setString(3,user.getPassword());
                return ps;
            }
        });
    }

    public User findById(String id) throws SQLException {

        Connection conn = dataSource.getConnection();
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
        executeSql(("delete from users"));
    }

    public int getCount() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(
                    "SELECT count(*) from users");
            rs = ps.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
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
}

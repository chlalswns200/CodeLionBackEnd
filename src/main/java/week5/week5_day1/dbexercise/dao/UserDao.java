package week5.week5_day1.dbexercise.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import week5.week5_day1.dbexercise.domain.User;

import javax.sql.DataSource;
import java.sql.*;

//환경 변수를 통해 id name password를 따로 저장하고 하는 방법

public class UserDao {

    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void add(final User user) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO users(id,name,password) values(?,?,?)",
                user.getId(),
                user.getName(),
                user.getPassword()
        );
    }

    public User findById(String id) {
        String sql = "select * from users where id = ?";
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                return user;
            }
        };

        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    public void deleteAll() throws SQLException {
        jdbcTemplate.update("delete from users");
    }

    public int getCount() {
        return this.jdbcTemplate.queryForObject("select count(*) from users;", Integer.class);
    }
}

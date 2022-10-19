package week5.week5_day1.dbexercise;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5.week5_day1.dbexercise.dao.UserDao;
import week5.week5_day1.dbexercise.dao.UserDaoFactory;
import week5.week5_day1.dbexercise.domain.User;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("15", "Eternity", "1123");
        //userDao.add(user);

        User findUser = userDao.findById("10");
        Assertions.assertEquals("Eternity", findUser.getName());
    }

}
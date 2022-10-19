package week5.week5_day1.dbexercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5.week5_day1.dbexercise.dao.*;
import week5.week5_day1.dbexercise.domain.User;

import java.sql.SQLException;

class UserDao2Test {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao2 userDao = new UserDao2(new LocalConnectionMaker());
        User user = new User("15", "Eternity", "1123");
        //userDao.add(user);

        User findUser = userDao.findById("10");
        Assertions.assertEquals("Eternity", findUser.getName());
    }

}
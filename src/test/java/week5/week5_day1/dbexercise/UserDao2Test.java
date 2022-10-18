package week5.week5_day1.dbexercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5.week5_day1.dbexercise.dao.AWSUse4rDaoImpl;
import week5.week5_day1.dbexercise.domain.User;

import java.sql.SQLException;

class UserDao2Test {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        AWSUse4rDaoImpl userDao = new AWSUse4rDaoImpl();
        User user = new User("12", "Eternity", "1123");
        userDao.add(user);

        User findUser = userDao.findById("12");
        Assertions.assertEquals("Eternity", findUser.getName());
    }

}
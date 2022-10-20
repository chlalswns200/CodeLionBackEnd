package week5.week5_day1.dbexercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import week5.week5_day1.dbexercise.dao.UserDao;
import week5.week5_day1.dbexercise.dao.UserDaoFactory;
import week5.week5_day1.dbexercise.domain.User;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao",UserDao.class);

        User user = new User("15", "Eternity", "1123");
        userDao.deleteAll();
        userDao.add(user);

        User findUser = userDao.findById("15");
        assertEquals(user.getName(),findUser.getName());
        assertEquals(user.getPassword(),findUser.getPassword());
    }

    @Test
    void deleteAll() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao",UserDao.class);
        userDao.deleteAll();
        assertEquals(0,userDao.getCount());
    }

    @Test
    void count() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao",UserDao.class);
        userDao.deleteAll();
        User user = new User("1", "Eternity", "11");

        userDao.add(user);
        assertEquals(1,userDao.getCount());

        User userB = new User("2", "Um", "22");
        userDao.add(userB);
        assertEquals(2,userDao.getCount());
    }

}
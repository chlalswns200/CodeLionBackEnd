package week5.week5_day1.dbexercise;


import org.junit.jupiter.api.Assertions;
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

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao",UserDao.class);

        User user = new User("15", "Eternity", "1123");
        //userDao.add(user);

        User findUser = userDao.findById("10");
        Assertions.assertEquals("Eternity", findUser.getName());
    }

}
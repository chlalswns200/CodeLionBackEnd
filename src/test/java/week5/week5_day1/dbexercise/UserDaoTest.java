package week5.week5_day1.dbexercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import week5.week5_day1.dbexercise.dao.UserDao;
import week5.week5_day1.dbexercise.dao.UserDaoFactory;
import week5.week5_day1.dbexercise.domain.User;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;
    UserDao userDao;
    User userA;
    User userB;

    @BeforeEach
    void setUp() {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
        userA = new User("1", "Eternity", "11");
        userB = new User("2", "Um", "22");
    }


    @Test
    void addAndSelect() {

        userDao.deleteAll();
        userDao.add(userA);

        User findUser = userDao.findById("1");
        assertEquals(userA.getName(), findUser.getName());
        assertEquals(userA.getPassword(), findUser.getPassword());
    }

    @Test
    void count() {
        userDao.deleteAll();

        userDao.add(userA);
        assertEquals(1, userDao.getCount());

        userDao.add(userB);
        assertEquals(2, userDao.getCount());
    }

    @Test
    void findById() {
        assertThrows(EmptyResultDataAccessException.class,()->{
            userDao.findById("500");
        });
    }

    @Test
    void deleteAll() {
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());
    }

    @Test
    @DisplayName("없을 때 빈 리스트")
    void getAllTest() {
        userDao.deleteAll();
        List<User> all = userDao.getAll();
        assertEquals(0, all.size());
    }

    @Test
    @DisplayName("2개 추가 후 테스트")
    void getAllTest2() {

        userDao.deleteAll();
        userDao.add(userA);
        userDao.add(userB);
        List<User> all = userDao.getAll();
        assertEquals(2, all.size());
    }

}
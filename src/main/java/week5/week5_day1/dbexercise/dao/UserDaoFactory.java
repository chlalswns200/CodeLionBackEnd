package week5.week5_day1.dbexercise.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week5.week5_day1.dbexercise.dao.connection.AwsConnectionMaker;
import week5.week5_day1.dbexercise.dao.connection.LocalConnectionMaker;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao() {

        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    @Bean
    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;

    }
}

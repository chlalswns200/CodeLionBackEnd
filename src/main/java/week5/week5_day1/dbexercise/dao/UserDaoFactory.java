package week5.week5_day1.dbexercise.dao;

public class UserDaoFactory {

    public UserDao awsUserDao() {

        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;

    }
}

package week5.week5_day1.dbexercise.dao.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws SQLException;
}

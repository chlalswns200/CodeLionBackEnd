package week4.week4_day2.read_line_parser;

import week4.week4_day2.read_line_parser.domain.Hospital;

import java.sql.*;
import java.util.Map;

public class HospitalDao {
    public void add() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO seoul_hospital(id,address,district,category,emergency_room,name,subdivision) values(?,?,?,?,?,?,?)"
        );
        ps.setString(1,"A221018");
        ps.setString(2,"테스트");
        ps.setString(3,"테스트");
        ps.setString(4,"B");
        ps.setInt(5,2);
        ps.setString(6,"최민준");
        ps.setString(7,"테스트");

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public Hospital findById(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                dbHost, dbUser, dbPassword);

        PreparedStatement ps = conn.prepareStatement(
                "select * FROM seoul_hospital WHERE id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();

        Hospital hospital = new Hospital(rs.getString("id"),rs.getString("address"),rs.getString("district"),
                rs.getString("category"),rs.getInt("emergency_room"),rs.getString("name"),rs.getString("subdivision"));
        rs.close();
        ps.close();
        conn.close();
        return hospital;

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        HospitalDao hd = new HospitalDao();
        Hospital a1100046 = hd.findById("A1100046");
        System.out.println("a1100046.getName() = " + a1100046.getName());

        hd.add();
        Hospital a221018 = hd.findById("A221018");
        System.out.println("a221018.getName() = " + a221018.getName());

    }
}

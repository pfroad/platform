package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?user=user_db&password=123456&useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false");
		
		PreparedStatement ps = conn.prepareStatement("select count(1) from user");
		ResultSet rs = ps.executeQuery();
		System.out.println(rs.getInt(0));
	}

}

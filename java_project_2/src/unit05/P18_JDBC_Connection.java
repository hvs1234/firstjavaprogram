package unit05;
import java.sql.*;
public class P18_JDBC_Connection {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
		myConn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDatabase", "avii" , "root");
		myStmt = myConn.createStatement();
		
		int a = myStmt.executeUpdate("INSERT INTO jdbc_tbl VALUES (6, 'Mysql','Akbar', '2021-02-18')");
		
		myRs = myStmt.executeQuery("select * from jdbc_tbl");
		
		while (myRs.next()) {
			System.out.println(myRs.getString("jdbc_id") + ", " + myRs.getString("title") + ", " 
		              + myRs.getString("author") + ", " + myRs.getString("submission_date"));
		
	    }
		
	}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
		myRs.close();
		myStmt.close();
		myConn.close();
		}
		
	}
		
}

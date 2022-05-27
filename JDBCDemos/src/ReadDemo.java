import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadDemo {

	
	public static void main(String[] args) throws Exception{
			//1. Collection DB information
	        String driverClassName="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost/empdb";
			String username="root";
			String password="root"; 
			//2. Register the driver
			Class c = Class.forName (driverClassName); 
			System.out.println(c);
			//3. Getting the Connection object
			Connection con =  DriverManager.getConnection(url, username, password);
			System.out.println(con);
			//4. Create Statement object and execute query
			String sql = "select * from employees";
			PreparedStatement pstmt = con.prepareStatement (sql); 
			ResultSet rs= pstmt.executeQuery();
			while (rs.next()) {
			String name= rs.getString("name");
            String contact = rs.getString("contact");
			System.out.println(name+""+contact);
			}
			//5. Release Resources
			pstmt.close();
			con.close();
}
}

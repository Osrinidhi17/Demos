import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
			public static void main(String[] args) throws Exception{
					
				//1. Collection DB information
			String driverClassName="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost/empdb";
			String username="root";
			String password="root";

			//2. Register the driver

			Class c =Class. forName(driverClassName);
			System.out.println(c); 
			//3. Getting the Connection object
            Connection con= DriverManager.getConnection(url, username, password);
			System.out.println(con);

			//4. Create Statement object and execute query
			String sql ="insert into employees (name, contact) values (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "Tom's");
            pstmt.setString(2, "97927997232");
            pstmt.execute();
			System.out.println("Sucess! Record added."); 
			//5. Release Resources
			pstmt.close();
			con.close();
			}
}

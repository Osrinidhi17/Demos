package in.hcl.firstspringdemo.DAOImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.hcl.firstspringdemo.model.Employee;

@Component
public class EmployeeDAOImpl {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDatasource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection conn=null;
	private Statement stmt = null;
	
	public void saveEmployee(Employee employee) {
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into employees(name,contact) value('"+employee.getName()+"','"+employee.getContact()+"')";
			boolean i = stmt.execute(sql);
			System.out.println("-------Successfully Employee Added-------");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int getTotalEmployees() {
		String sql = "select count(*) from employees";
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate.queryForInt(sql);
	}
	
	
}

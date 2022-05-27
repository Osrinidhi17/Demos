package in.hcl.firstspringdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.hcl.firstspringdemo.DAOImpl.EmployeeDAOImpl;
import in.hcl.firstspringdemo.model.Employee;

public class ApplicationTest {

	  public static void main(String[] args)
	    {
	    	//create bean factory
	    	 ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	    	 System.out.println(ctx);
	    	 
	    	 EmployeeDAOImpl employeeDAOImpl = ctx.getBean("employeeDAOImpl",EmployeeDAOImpl.class);
             Employee employee;
             employee = new Employee();
             employee.setName("srinidhi");
             employee.setContact("1234567890");
	        
             employeeDAOImpl.saveEmployee(employee);
             employee.setName("nidhi");
             employee.setContact("987654321");
             
             employeeDAOImpl.saveEmployee(employee);

             int totalEmployees = employeeDAOImpl.getTotalEmployees();
             System.out.println("total Number of employees:"+totalEmployees);
	    	}
}

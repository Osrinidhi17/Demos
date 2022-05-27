package in.hcl.firstspringdemo.model;

public class Employee {
	
	private String name;
	private String contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", contact=" + contact + "]";
	}

}

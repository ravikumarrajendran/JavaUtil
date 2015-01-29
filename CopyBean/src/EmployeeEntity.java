
public class EmployeeEntity {
	
	private String name;
	private int emp_Id;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	/*public EmployeeEntity(String name, int emp_Id, String designation) {
		super();
		this.name = name;
		this.emp_Id = emp_Id;
		this.designation = designation;
	}*/
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}

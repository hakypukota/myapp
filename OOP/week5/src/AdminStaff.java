
public class AdminStaff extends Employees{

	private String managerAssigned;
	
	public void setManagerAssigned(String Manager){
		managerAssigned = Manager;
	}
	public String getManagerAssigned(){
		return managerAssigned;
	}
	public void viewEmpDetails(){
		System.out.println("Employee's name:"+getName());
		System.out.println("Holiday hours left:"+getHolidayEntitlement());
		System.out.println("Pay Rate:"+getPayRate());
		System.out.println("Contracted hours:"+getContractedHours());
		System.out.println("Manager's name:"+managerAssigned);
		viewYearlySalary();
	}
	public AdminStaff() {
		setName("Sarrah");
		changePayRate(15);
		changeHours(40);
		setHolidayEntitlement(30);
	}

}

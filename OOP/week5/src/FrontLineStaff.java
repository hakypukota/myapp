
public class FrontLineStaff extends Employees {
	private int paidHours;
	public void viewYearlySalary(){
		System.out.println("Current salary is:"+(getPayRate()*paidHours));
	}
	public FrontLineStaff(){
		setName("John");
		changePayRate(11.5);
		changeHours(40);
		setHolidayEntitlement(30);
		paidHours = 34;
	}
}

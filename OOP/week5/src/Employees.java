
public class Employees {

	private String Name;
	private double payRate;
	private int contractedHours;
	private int holidayEntitlement;
	
	public String getName(){
		return Name;
	}
	public double getPayRate(){
		return payRate;
	}
	public int getContractedHours(){
		return contractedHours;
	}
	public int getHolidayEntitlement(){
		return holidayEntitlement;
	}
	public void setName(String nameIn){
		Name = nameIn;
	}
	public void changePayRate(double payRateIn){
		payRate=payRateIn;
	}
	public boolean changeHours(int contractedHoursIn){
		if(contractedHoursIn<40){
			contractedHours=contractedHoursIn;
			return true;
		}
		else{
			return false;
		}
		
	}
	public void setHolidayEntitlement(int holidIn){
		holidayEntitlement = holidIn;
	}
	public boolean bookHoliday(int holiday){
		if(holidayEntitlement-holiday>=0){
			holidayEntitlement =-holiday;
			return true;
		}
		else{
			return false;
		}
	}
	public double viewYearlySalary(){
		return ((payRate*contractedHours*52)-holidayEntitlement);
	}
	public void viewEmpDetails(){
		System.out.println("Employee's name:"+getName());
		System.out.println("Holiday hours left:"+holidayEntitlement);
		System.out.println("Pay Rate:"+getPayRate());
		System.out.println("Contracted hours:"+getContractedHours());
		viewYearlySalary();
	}
	public Employees(){
		Name = "Alex";
		payRate = 9.5;
		contractedHours = 35;
		holidayEntitlement = 30;
	}
	
}

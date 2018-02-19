
public class Managers extends Employees{

	private double bonusFigure;
	
	public double getBonusFigure(){
		return bonusFigure;
	}
	public boolean setBonusFigure(double bonusIn){
		if (bonusIn>100&&bonusIn<0){
			bonusFigure = bonusIn;
			return true;
		}
		else{
			return false;
		}
	}
	public double viewYearlySalary(){
		System.out.println(" mng Yearly salary is:"+(    (((getPayRate()*getContractedHours()*52)-getHolidayEntitlement())*bonusFigure)+ ((getPayRate()*getContractedHours()*52)-getHolidayEntitlement())        ));
	}
	public Managers(){
		setName("Kyle");
		changePayRate(17);
		changeHours(40);
		setHolidayEntitlement(30);
		setBonusFigure(50);
	}
	public static void main(String[] args) {
		
		Employees e1 = new Employees();
		FrontLineStaff f1 = new FrontLineStaff();
		AdminStaff a1 = new AdminStaff();
		Managers m1 = new Managers();
		
		e1.viewEmpDetails();
		f1.viewYearlySalary();
		a1.viewYearlySalary();
		m1.viewYearlySalary();
		
	}

}

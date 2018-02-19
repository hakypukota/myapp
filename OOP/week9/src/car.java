
public class car extends vehicle {
	public double CalculateFee(){
		if (getWeight()>1590){
			return 5+((getWeight()-1590)/10);
		}
		else {
			return 5;
		}
		
	}
}

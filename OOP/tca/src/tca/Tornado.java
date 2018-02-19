package tca;

public class Tornado extends Storm {
	public Tornado(String nameIn, int windSpeedIn, int temperatureIn) {
		super(nameIn, windSpeedIn, temperatureIn);
		// TODO Auto-generated constructor stub
	}
	public String getClassification(){
		if (getWindSpeed()<=112 && getWindSpeed()>=40){
			return "Weak";
		}
		else if(getWindSpeed()<=206 && getWindSpeed()>=113){
			return "Strong";
		}
		else if (getWindSpeed()>=207){
			return "Violent";
		}
		else {
			return "Unclassified";
		}
	}
	public String getAdvice(){
		if (getClassification()=="Weak"){
			return "Find safe room/shelter, shield yourself from debris";
		}
		else if(getClassification()=="Strong" || getClassification()=="Viloent"){
			return "Find underground shelter, crouch near to the floor covering your head with your hands";
		}
		else {
			return "There is no need to panic";
		}
	}
}

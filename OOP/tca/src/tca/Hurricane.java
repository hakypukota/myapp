package tca;

public class Hurricane extends Storm{

	public Hurricane(String nameIn, int windSpeedIn, int temperatureIn) {
		super(nameIn, windSpeedIn, temperatureIn);
		// TODO Auto-generated constructor stub
	}
	public String getClassification(){
		if (getWindSpeed()<=110 && getWindSpeed()>=74){
			return "Dangerous";
		}
		else if(getWindSpeed()<=129 && getWindSpeed()>=111){
			return "Devastating";
		}
		else if (getWindSpeed()>=130){
			return "Catastrophic";
		}
		else {
			return "Tropical Storm/Depression";
		}
	}
	public String getAdvice(){
		if (getClassification()=="Dangerous"){
			return "Close storm shutters, stay away from windows";
		}
		else if(getClassification()=="Devastating"){
			return "Costal regions are encouraged to evacuate";
		}
		else if(getClassification()=="Catastrophic"){
			return "Evacuate";
		}
		else {
			return "There is no need to panic";
		}
	}	
	

}

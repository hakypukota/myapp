package tca;

public class AdviceCentre {

	Storm[] stormArray = new Storm[10];
	
	public boolean addStorm(Storm stormIn){
		for (int i=0;i<10;i++){
			if (stormArray[i]==null){
				stormArray[i]=stormIn;
				return true;
			}
		}
		return false;
	}
	public boolean remStorm(String nameIn){
		for (int i=0;i<10;i++){
			if (stormArray[i].getName()==nameIn){
				stormArray[i]=null;
				return true;
			}
		}
		return false;
	}
	public Storm getStorm(String nameIn){
		for (int i=0;i<10;i++){
			if (stormArray[i].getName()==nameIn){
				return stormArray[i];
			}
		}
		return null;
	}
	

}

package tca;

public abstract class Storm {
private String name;
private int windSpeed;
private int temperature;

public String getName(){
	return name;
}
public int getWindSpeed(){
	return windSpeed;
}
public int getTemperature(){
	return temperature;
}

public Storm(String nameIn,int windSpeedIn, int temperatureIn){
	name = nameIn;
	windSpeed = windSpeedIn;
	temperature = temperatureIn;
}
public abstract String getClassification();
public abstract String getAdvice();
}

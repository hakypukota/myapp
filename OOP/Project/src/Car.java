
public class Car {
	private String Name;
	private String Model;
	private int currentSpeed;
	private int maxSpeed;
	private int fuelLevel;
	
	public Car() {
		Name = "Honda";
		Model = "Civic";
		currentSpeed = 0;
		maxSpeed = 100;
		fuelLevel= 100;
	}
	public Car(String NameIn, String ModelIn,int currentSpeedIn,int maxSpeedIn,int fuelLevelIn) {
		Name = NameIn;
		Model = ModelIn;
		currentSpeed = currentSpeedIn;
		maxSpeed = maxSpeedIn;
		fuelLevel= fuelLevelIn;
	}
	public String getName()
	{
		return Name;
	
	}
	public String getModel()
	{
		return Model;
	
	}
	public int getCurrentSpeed()
	{
		return currentSpeed;
	
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	
	}
	public int getFuelLevel()
	{
		return fuelLevel;
	}
	public void setName(String NameIn)
	{
		Name = NameIn;
	}
	public void setModel(String ModelIn)
	{
		Model = ModelIn;
	}
	public void setCurrentSpeed(int currentSpeedIn){
		currentSpeed = currentSpeedIn;
	}
	public void setMaxSpeed(int maxSpeedIn){
		maxSpeed = maxSpeedIn;
	}
	public void setFuelLevel (int fuelLevelIn){
		fuelLevel = fuelLevelIn;
		
	}
	public void accelerate(){
		currentSpeed++;
		fuelLevel--;
	}
	public void brake(){
		currentSpeed--;
	}
	public void refuel(){
		fuelLevel = 100;
	}
}
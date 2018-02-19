
public class Car {
	private int number;
	private String model;
	private String ownersName;
	
	public int getNumber(){
		return number;
	}
	public String getModel(){
		return model;
	}
	public String getOwnersName(){
		return ownersName;
	}
	public void setNumber (int numberIn){
		number=numberIn;
	}
	public void setModel (String modelIn){
		model=modelIn;
	}
	public void setOwnersName(String ownersNameIn){
		ownersName=ownersNameIn;
	}
	public Car(){
		setModel("BMW");
		setOwnersName("Alex");
		setNumber(1234);
	}
	public Car(String modelIn,String nameIn,int numberIn){
		model=modelIn;
		ownersName=nameIn;
		number=numberIn;
	}

}

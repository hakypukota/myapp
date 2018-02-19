
public abstract class vehicle {
	private String number;
	private int weight;
	
	public abstract double CalculateFee();
	public void setNumber(String numIn){
		number=numIn;
	}
	public void setWeight(int weigIn){
		weight=weigIn;
	}
	public String getNumber(){
		return number;
	}
	public int getWeight() {
		
		return weight;
	}
}

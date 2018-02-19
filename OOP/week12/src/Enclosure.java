
public class Enclosure {
	private int number;
	private int daysBooked;
	private double price;
	private Dog occupant;
	
	public int getNumber(){
		return number;
	}
	public int getDaysBooked(){
		return daysBooked;
	}
	public double getPrice(){
		return price;
	}
	public Dog getOccupant(){
		return occupant;
	}
	public void setOccupant(Dog occupantIn){
		occupant=occupantIn;
	}
	public void setDaysBooked(int daysBookedIn){
		daysBooked=daysBookedIn;
	}
	public Enclosure(int numberIn,double priceIn){
		number=numberIn;
		price=priceIn;
	}
	
}

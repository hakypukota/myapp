
public class Bus {

	private Passenger[] passengerInTheBus = new Passenger[15];

	
	public boolean addPassenger(Passenger PassengerIn){
		for (int i = 0; i< passengerInTheBus.length;i++) {
			if(passengerInTheBus ==null){
				passengerInTheBus[i]=PassengerIn;
				passengerInTheBus[i].setSeat(i);
				return true;
			}
		}
		return false;
	}
	public boolean remPassenger(int seatIn){
		for (int i=0;i<passengerInTheBus.length;i++){
			if (passengerInTheBus[i]!=null){
				if(passengerInTheBus[i].getSeat() == seatIn){
					passengerInTheBus[i]=null;
					return true;
				}
					
			}
		}
		return false;
	}

}

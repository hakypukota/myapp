
public class lorry extends vehicle{
	public double CalculateFee(){
		if (getWeight()>8000){
			return 15;
		}
		else{
			return 10;
		}
	}
}


import java.util.Scanner;
public class Bridge {
	vehicle[] vehicleList = new vehicle[20];
	
	public int calcTotalWeight(){
		int temp=0;
		for (int i=0;i<20;i++){
			temp = temp + vehicleList[i].getWeight();
		}
		return temp;
	}
	public boolean addVehicle(vehicle veh){
		for (int i=0;i<20;i++){
			if((calcTotalWeight()+veh.getWeight()<=30000) && (vehicleList[i]==null)){
				vehicleList[i]=veh;
				System.out.print(vehicleList[i].CalculateFee()+" - fee");
				return true;
			}
			
		}
		return false;
	}
	public boolean remVehicle(String numberIn){
		for (int i=0;i<20;i++){
			if (vehicleList[i].getNumber()==numberIn){
				vehicleList[i]=null;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		char user='o';
		lorry lor = new lorry();
		car c=new car();
		motorbike moto = new motorbike();
		
		Scanner scanIn = new Scanner(System.in);
		Scanner scannIn = new Scanner(System.in);
		while (user!='X'){
			System.out.println("A-add, B - remove, X - quit");
			String input = scanIn.nextLine();
			if (input =="A"){
				System.out.println("Weight, number");
				
				
			}
		}
	}
}

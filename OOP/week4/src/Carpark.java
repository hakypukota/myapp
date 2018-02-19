
import java.util.Scanner;
public class Carpark {
	Car[] carPark = new Car[15];
	
	public boolean addCar(Car carIn){
		for (int i=0;i<15;i++){
			if(carPark[i] ==null){
				carPark[i]=carIn;
				System.out.println("Your number is:"+carPark[i].getNumber());
				return true;
			}
		}
		System.out.println("Car park is full");
		return false;
	}
	public boolean remCar(int numberIn){
		for (int i=0;i<15;i++){
			if(carPark[i]!=null){
				if(carPark[i].getNumber()==numberIn){
					carPark[i]=null;
					return true;
				}
			}
		}
		System.out.println("There is no car with that number on the car park");
		return false;
	}
	public int showInfo(){
		int spaces=0;
		for (int i=0;i<15;i++){
			if(carPark[i]==null){
				spaces++;
			}
		}
		return spaces;
	}
	public Carpark(){
		
	}

	public static void main(String[] args){
		int state=1;
		Car c1 = new Car();
		Carpark c2 = new Carpark();
		Scanner scanIn = new Scanner(System.in);
		Scanner scannIn = new Scanner(System.in);
		while (state==1){
			System.out.println("Please select one of the following options:");
			System.out.println("A – Add a car");
			System.out.println("B – Remove a car");
			System.out.println("C – View number of free spaces/number of cars in the car park");
			System.out.println("X – Quit");
			
			String input = scanIn.nextLine();
			
			if (input.equals("A")){
				
				if(c2.addCar(c1)==true){
					System.out.println("Your car has been been added to the car park");
				}
				else {
					System.out.println("Something's wrong :(");
				}
			}
			else if(input.equals("B")){
				int num = Integer.parseInt(scanIn.nextLine());
				scannIn.close();
				if(c2.remCar(num)==true){
					System.out.println("ur car has been removed");
				}
				else{
					System.out.println("Somethings's wrong:(");
				}
				
			}
			else if(input.equals("C")){
				c2.showInfo();
			}
			else if(input=="X"){
				System.out.println("It was a pleasure!");
				state = 0;
			}
			
			
		}
		scanIn.close();
	}


}
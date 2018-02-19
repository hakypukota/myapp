import java.util.Scanner;


public class Company {
	Enclosure[] enclosure = new Enclosure[10];
	
	
	public Company(){
		for(int i=0;i<10;i++){
			Enclosure enc = new Enclosure(i,5.30);
			enclosure[i]=enc;
		}
	}
	public boolean bookDog(Dog dogIn,int daysIn){
		for(int i=0;i<10;i++){
			if (enclosure[i].getOccupant()==null){
				enclosure[i].setOccupant(dogIn);
				enclosure[i].setDaysBooked(daysIn);
				return true;
			}
		}
		return false;
	}
	public boolean remDog(int numberIn){
		for(int i=0;i<10;i++){
			if (enclosure[i].getNumber()==numberIn && enclosure[i].getOccupant()!=null){
				enclosure[numberIn].setOccupant(null);
				return true;
			}
		}
		return false;

	}
	public Dog viewDog(int numberIn){
		for(int i=0;i<10;i++){
			if(enclosure[i].getNumber()==numberIn){
				return enclosure[i].getOccupant();
			}
		}
		return null;
	}
	public static void main(String[] args){
		int state=1;
		Company c1 = new Company();
		Enclosure e1 = new Enclosure(0,5.30);
		Scanner scanIn = new Scanner(System.in);
		while (state==1){
			System.out.println("Please select one of the following options:");
			System.out.println("A – Book in a dog");
			System.out.println("B – Remove a dog");
			System.out.println("C – View a dog");
			System.out.println("X – Quit");
			
			String input = scanIn.nextLine();
			
			if (input.equals("A")){
				System.out.println("The price is "+e1.getPrice());
				System.out.println("Dog's name");
				 String d1Name= scanIn.nextLine();
				 System.out.println("Dog's owner");
				 String d1Owner= scanIn.nextLine();
				 System.out.println("Dog's age");
				 String d1Age= scanIn.nextLine();
				 int d1AgeInt= Integer.parseInt(d1Age);
				 System.out.println("Dog's gender");
				 String d1Gender= scanIn.nextLine();
				 System.out.println("Dog's breed");
				 String d1Breed= scanIn.nextLine();
				 System.out.println("Dog's general notes");
				 String d1GenNotes= scanIn.nextLine();
				 System.out.println("days in the enclosure");
				 String strDaysIn= scanIn.nextLine();
				 int daysIntIn= Integer.parseInt(strDaysIn);
				 
				Dog d1 = new Dog(d1Name,d1Owner,d1AgeInt,d1Gender,d1Breed,d1GenNotes);
				
				if(c1.bookDog(d1, daysIntIn)==true){
					System.out.println("Your dog has been added");
				}
				else {
					System.out.println("Something's wrong :(");
				}
			}
			else if(input.equals("B")){
				int num = Integer.parseInt(scanIn.nextLine());
				
				if(c1.remDog(num)==true){
					System.out.println("ur dog has been removed");
				}
				else{
					System.out.println("Somethings's wrong:(");
				}
				
			}
			else if(input.equals("C")){
				int numm = Integer.parseInt(scanIn.nextLine());
				c1.viewDog(numm);
			}
			else if(input=="X"){
				System.out.println("It was a pleasure!");
				state = 0;
			}
			
			
		}
		scanIn.close(); 
	}
	
}

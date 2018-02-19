
public class Dog {
	private String name;
	private String owner;
	private int age;
	private String gender;
	private String breed;
	private String generalNotes;
	
	public String getName(){
		return name;
	}
	public String getOwner(){
		return owner;
	}
	public int getAge(){
		return age;
	}
	public String gender(){
		return gender;
	}
	public String getBreed(){
		return breed;
	}
	public String getGeneralNotes(){
		return generalNotes;
	}
	
	public Dog(String nameIn, String ownerIn,int ageIn,String genderIn,String breedIn,String generalNotesIn){
		name=nameIn;
		owner=ownerIn;
		age=ageIn;
		gender=genderIn;
		breed=breedIn;
		generalNotes=generalNotesIn;
	}
}

package entities;

public class Gamer {



	public int id;
	
	public String firstName;
	
	public String lastName;
	
	public int birthYear;
	
	public long identityNumber;

	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}


}


public class Customer implements Entity{
  
  
  private int id;
  private String firstName;
  private String lastName;
  private long identityNumber;
  private int birthYear;
  
public Customer() {
	  
  }
  

  
public Customer(int id, String firstName, String lastName, long identityNumber, int birthYear) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.identityNumber = identityNumber;
	this.birthYear = birthYear;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getIdentityNumber() {
	return identityNumber;
}
public void setIdentityNumber(long identityNumber) {
	this.identityNumber = identityNumber;
}

public int getBirthYear() {
	return birthYear;
}

public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}


  
	
}

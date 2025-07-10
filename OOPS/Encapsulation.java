package OOPS;

//hide business logic/implementation details
//show essential/functionality to the user 

//wrap data and code together as single unit 
//and protect it from outside interference/world
//data hiding
public class Encapsulation {
private int id;
private String name,emailID;

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

@Override
public String toString() {
	return "Encapsulation [id=" + id + ", name=" + name + ", emailID=" + emailID + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

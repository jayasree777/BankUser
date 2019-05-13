import java.util.*;
import java.io.*;
class User{

	String firstName;
	String lastName;
	int age;

	String ssn;
    int id;
	String email;

	 ArrayList<User> users = new ArrayList<User>();

	 //User(){
	 //}

	User(String firstName, String lastName, int age, String ssn, int id, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.id = id;
		this.email = email;

		
		
		users.add(this);
	}

	/*public String getssn(){
		return this.ssn;
	}

	public void setid(String ssn){
		this.ssn = ssn;
	}*/

	public String toString(){
		return this.firstName+" "+this.lastName;
	}

	

	


	public String update(){
		
/*
		System.out.println("Enter the new firstName");
		String newfirstname = myObj.nextLine();
		firstName=newfirstName;

		System.out.println("Enter the new LastName");
		String newlastname = myObj.nextLine();
		lastName=newlastName;

		System.out.println("Enter the new age");
		int newage = myObj.nextLine();
		age=newage;

*/
        
		System.out.println("Enter the firstname to be updated");
		Scanner check = new Scanner(System.in);
		this.firstName=check.nextLine();
		System.out.println("Enter the new firstname");
		String newfirstName = check.nextLine();
		this.firstName=newfirstName;
		return firstName;

		


	}
	


}


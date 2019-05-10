import java.util.*;
import java.io.*;
class User{

	String firstName;
	String lastName;
	int age;

	private String ssn;
	private int id;
	private String email;

	ArrayList<User> users = new ArrayList<User>();

	User(){
	}

	void createUser(String firstName, String lastName, int age, String ssn, int id, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.id = id;
		this.email = email;

		
		User user= new User();
		ArrayList<User> users.add(user)
	}

	public int getid(){
		return this.id;
	}

	public void setid(int id){
		this.id = id;
	}

	public String getemailId(){
		return this.email;
	}

	public void setemailId(String email){
		this.email = email;
	}

	public ArrayList<User> getUsers(){
		return this.users;
	}

	public String toString(){
		return this.firstName+" "+this.lastName;
	}


	public void create() {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter firstName");
		String firstName = myObj.nextLine();
		
		System.out.println("Enter lastName");
		String lastName = myObj.nextLine();
		
		System.out.println("Enter age");
		int age = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println("Enter ssn");
		String ssn = myObj.nextLine();
		
		System.out.println("Enter id");
		int id = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println("Enter Email");
		String email = myObj.nextLine();

		this.createUser(firstName, lastName, age, ssn, id, email);
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


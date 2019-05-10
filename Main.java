import java.util.*;




class Main extends User{

	public static void main(String[] args) {

		boolean isExit = true;


		create();
		System.out.println("SHOW USERS");
		ArrayList<User> users = user.getUsers();
		users.forEach(u->System.out.println(u.toString()));

		Bank bank = new Bank();
		bank.createBankAccount();
		System.out.println("SHOW BANK");
		ArrayList<Bank> bankAcc = bank.getbankAcc();
		bankAcc.forEach(b->System.out.println(b.toString()));

		while(isExit){
			Scanner myObj = new Scanner(System.in);
			int val = myObj.nextInt();

			switch (val) {
				case 4:
					isExit = !isExit;
					break;
				default:
					System.out.println("Maharshi");
					break;
			}
		}
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
}
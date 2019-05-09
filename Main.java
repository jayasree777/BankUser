import java.util.*;


class Main extends User{

	public static void main(String[] args) {

		boolean isExit = true;

		User user = new User();
		user.create();
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
}
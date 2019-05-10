import java.util.*;

class Bank_User{

    public static void main(String[] args) {

        boolean isExit = true;
        
        while(isExit){
            System.out.println("Please enter the type of account:\n 1. User \n 2.Bank \n3.Exit");
            Scanner obj1=new Scanner(System.in);
            int type= obj1.nextInt();




			switch (type) {
                case 1:
                    System.out.println("Plaese enter the choice:\n 1. User-Create \n2. User-update \n3.User-delete \n4.Exit");
                    Scanner obj2=new Scanner(System.in);
                    int choice= obj2.nextInt();

                    switch (choice){

                        case 1:
                            System.out.println("CREATE USER");
                            create();
                            User user = new User();
                            System.out.println("SHOW USERS");
		                    ArrayList<User> users = user.getUsers();
		                    users.forEach(u->System.out.println(u.toString()));
                            break;

                        case 2:
                            System.out.println("UPDATE USER");
                            break;

                        case 3:
                            System.out.println("DELETE USER");
                            break;
                        
                        case 4:
                            isExit = !isExit;
                            break;

                        default:
                            System.out.println("Invalid input");
                            break;

                     
                    }
                 
                case 2:
                    System.out.println("Plaese enter the choice:\n 1. Bank-Create \n2. Bank-update \n3.Bank-delete \n4.Exit");
                    Scanner obj3=new Scanner(System.in);
                    int option= obj3.nextInt();

                    switch (option){

                        case 1:
                            System.out.println("CREATE BANK");
                            break;

                        case 2:
                            System.out.println("UPDATE BANK");
                            break;

                        case 3:
                            System.out.println("DELETE BANK");
                            break;
                        
                        case 4:
                            isExit = !isExit;
                            break;

                        default:
                            System.out.println("Invalid input");
                            break;
                
                        
                    }
                case 3:
                    isExit = !isExit;
                    break;
            }
			
            
		}
    }

    public static void create() {
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
        
    
        User user = new User(firstName, lastName, age, ssn, id, email);

    }
}


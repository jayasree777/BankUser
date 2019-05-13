import java.util.*;

class Bank_User{

    private static ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {

        boolean isExit = true;
        
        while(isExit){
            System.out.println("Please enter the type of account:\n 1. User \n 2.Bank \n3.Exit");
            Scanner read=new Scanner(System.in);
            int type= read.nextInt();





			switch (type) {
                case 1:
                    System.out.println("Plaese enter the choice:\n 1. User-Create \n2. User-update \n3.User-delete \n4.Exit");
                    Scanner read1=new Scanner(System.in);
                    int choice= read1.nextInt();
                   // ArrayList<User> users = user.getUsers();

                    switch (choice){

                        case 1:
                            System.out.println("CREATE USER");
                            create();
                            // User user = new User();
                            //System.out.println("SHOW USERS");
		                    //ArrayList<User> users = user.getUsers();
                            //users.forEach(u->System.out.println(u.toString()));
                            users.forEach(user->System.out.println( user.toString() ));
                        
                            break;

                        case 2:
                            int id=1;
                            System.out.println("UPDATE USER");
                            showUser();
                            Scanner myObj = new Scanner(System.in);

		                    System.out.println("Enter firstName");
		                    String newfirstName = myObj.nextLine();
		
		                    System.out.println("Enter lastName");
		                    String newlastName = myObj.nextLine();
		
		                    System.out.println("Enter age");
		                    int newage = myObj.nextInt();
		                    myObj.nextLine();
		
		                    System.out.println("Enter ssn");
		                    String newssn = myObj.nextLine();
		
		
		                    System.out.println("Enter Email");
                            String newemail = myObj.nextLine();

                            for (User user : users ) {
                                if(user.id == id) {
                                    user.firstName=newfirstName;
                                    user.lastName=newlastName;
                                    user.age=newage;
                                    user.ssn=newssn;
                                    user.email=newemail;
                                    System.out.println(user.toString());										
                                }
                            
                            }

                            

                            break;

                        case 3:
                            
                            Scanner myObj1 = new Scanner(System.in);

		                    System.out.println("Enter id to be removed");
		                    int rid = myObj1.nextInt();

                            System.out.println("DELETE USER");
                            if(users.size() >= 1) {
								for (User user : users ) {
									if(user.id == rid) {
										users.remove(rid);										
									}
								}
							} else {
								System.out.println("NO USERS AVAILABLE");
							}
                            break;
                        
                        case 4:
                            isExit = !isExit;
                            break;

                        default:
                            System.out.println("Invalid input");
                            break;

                     
                    }
                    break;
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
                    break;
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
        users.add(user);

    }

    public static void showUser(){

        System.out.println("PLEASE ENTER ID TO ACCESS INFO");
        Scanner read=new Scanner(System.in);
        int id = read.nextInt();
        showUsers();
        User user=getUserById(id);
        System.out.println(user.toString());
        
		/*System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("SSN: " + ssn);
		System.out.println("ID: " + id);
		System.out.println("Email: " + email);*/
    }


    public static void showUsers(){
        System.out.println("SHOWING USERS:\n");
        for(User u: users){
            System.out.println(u.toString());
        }
    }
    
    public static User getUserById(int id){
		return users.stream()
					.filter(user -> user.id == id)
					.findAny()
					.orElse(null);
	}

    public ArrayList<User> getUsers(){
		return this.users;
	}

	
}


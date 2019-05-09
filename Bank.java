import java.util.*;

class Bank{

	private String accountNumber;
	int amount;
	boolean shared;

	int sharedUsedId;
    String bankName;
    private int bankId;
    
    ArrayList<Bank> bankAcc = new ArrayList<Bank>();

	Bank(){
	}

	void createBank(String accountNumber, int amount, boolean shared, int sharedUsedId, String bankName, int bankId){
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.shared = shared;
		this.sharedUsedId = sharedUsedId;
		this.bankName = bankName;
        this.bankId = bankId;
        
        bankAcc.add(this);
	}

	public String getaccountNumber(){
		return this.accountNumber;
	}

	public void setaccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getbankId(){
		return this.bankId;
	}

	public void setbankId(int bankId){
		this.bankId = bankId;
    }
    
    public ArrayList<Bank> getbankAcc(){
		return this.bankAcc;
    }
    
    public String toString(){
		return this.accountNumber+" "+this.bankName;
	}

	public void createBankAccount() {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter account number");
		String accountNumber = myObj.nextLine();
		
		System.out.println("Enter amount");
        int amount = myObj.nextInt();
        myObj.nextLine();
        
		System.out.println("Enter if it is shared or not");
		boolean shared = myObj.nextBoolean();
		myObj.nextLine();
		
		System.out.println("Enter shared user id");
		int sharedUsedId = myObj.nextInt();
        myObj.nextLine();
        
		System.out.println("Enter bank name");
		String bankName = myObj.nextLine();
	
		
		System.out.println("Enter bank id");
        int bankId = myObj.nextInt();
        
		this.createBank(accountNumber, amount, shared, sharedUsedId, bankName, bankId);
	}


}


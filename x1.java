import java.util.*;

class Account{
	private final int accountNumber;
	private final String accountHolder;
	private double Balance;
	public Account(int accountNumber,String accountHolder,double initialBalance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.Balance=initialBalance;
	}
	

	public synchronized  void  deposite(double amount) {
		Balance+=amount;
	}
	
	public synchronized boolean withdraw(double amount) {
		if(Balance>amount) {
			Balance-=amount;
			return true;
		}
		return false;
	}
	public synchronized double getBalance() {
		return Balance;
	}
}

class AccountManager{
	private static AccountManager  INSTANCE = new AccountManager();
private	final Map<Integer , Account> accounts = new HashMap<>();

public AccountManager getInstance() {
	return INSTANCE;
}

public synchronized void createAcc(int accountNumber,String accountHolder ,double Balance) {
	if(!accounts.containsKey(accountNumber)) {
		accounts.put(accountNumber, new Account(accountNumber,accountHolder,Balance));
		System.out.println("Account is created");
	}
	}

public synchronized void deposite(int accountNumber,double amount) {
	Account account = accounts.get(accountNumber);
	if(account!=null) {
		account.deposite(amount);
		System.out.println("succusfully deposited");
	}
}

public synchronized void withdraw(int accountNumber,double amount) {
	Account account = accounts.get(accountNumber);
	if(account!=null) {
		account.withdraw(amount);
		System.out.println("succusfully withdraw");
}
}
public synchronized double getbalance(int accountNumber) {
	Account account = accounts.get(accountNumber);
	if(account!=null) {
		return account.getBalance();
	}
	return 0;
}
}
public class MainAcc {

	public static void main(String[] args) {
		AccountManager acc2=new AccountManager();
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("\n1.create\n2.deposite\n3.withdrw\n4.balance");
        	int ch= sc.nextInt();
        	switch(ch) {
        	case 1:
        		int accNo=sc.nextInt();
        		String accName=sc.nextLine();
        		double inb=sc.nextDouble();
        		acc2.createAcc(accNo,accName,inb);
        		break;
        	case 2 :
        		int accNo2=sc.nextInt();
        		double amt=sc.nextDouble();
        		acc2.deposite(accNo2,amt);
        		
        	case 3:
        		int accNoup=sc.nextInt();
        		double amtw=sc.nextDouble();
        		acc2.withdraw(accNoup,amtw);
        		
        	case 4 :
        	int accNo3=sc.nextInt();
        		
        		acc2.getbalance(accNo3);
        	}
        }
	}

}

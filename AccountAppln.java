package practice;

public class AccountAppln {

	public static void main(String[] args) {
	   Account account = new Account();
	   /* account.setAccountNumber(1222);
	   account.setCustomerName("Shravya");
	   account.setBalance(40000); */ 
	   Account account2 = new Account(12001,"Deloitte",30000);
	   
	   System.out.println(account.getAccountNumber());
	   System.out.println(account.getCustomerName());
	   System.out.println(account.getBalance());
	   System.out.println(account2.getAccountNumber());
	   System.out.println(account2.getCustomerName());
	   System.out.println(account2.getBalance());
	   

	}

}

package practice;

public class CustomerAppln {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setCustomerID(12001);
        cust.setCustomerName("Shravya");
        cust.setCity("Hyderabad");
	
	    System.out.println(cust.getCustomerID());
	    System.out.println(cust.getCustomerName());
	    System.out.println(cust.getCity());
	}

}

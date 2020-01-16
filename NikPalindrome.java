package practice;

public class NikPalindrome {

	 public static void main(String[] args){
	    	String str = args[0];
	    	StringBuffer sb1=new StringBuffer();
	    	sb1.append(str);
	    	System.out.println("The string is :" +sb1);
	    	
	    	StringBuffer sb2=new StringBuffer();
	    	sb2.append(sb1.reverse());
	    	System.out.println("The string reversed is :" +sb2);
	    	
	    	String str2=sb2.toString();
	    	boolean b= str2.equals(sb1);
	    	
	    	System.out.println("The string is :" +str2);
	    	if(b==true)
	    		System.out.println("The given string is not a palindrome");
	    	else
	    		System.out.println("The given string is a palindrome");
	 }
	 
	    	
	    	
	    	
	    	
	    	
	    	
}

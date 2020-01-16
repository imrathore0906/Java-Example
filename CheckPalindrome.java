package practice;

public class CheckPalindrome {
    public static void main(String[] args){
    	String str = args[0];
    	StringBuffer sb1 = new StringBuffer();
    	sb1.append(str);
    	System.out.println(sb1);
    	
    	StringBuffer sb2 = new StringBuffer();
    	sb2.append(sb1.reverse());
    	System.out.println(sb2);
    	
    	String str2 = sb2.toString();
    	
    	boolean b = str.equals(str2);
    	if(b==true){
    		System.out.println("Palindrome");
    	}else System.out.println("Not a palindrome");
    	
    } 
}

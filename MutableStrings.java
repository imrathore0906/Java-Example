package practice;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(); //synchronised or thread-safe
		sb1.append("deloitte");
		System.out.println(sb1);
		sb1.append("hyderabad");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.delete(7, 10));
	    System.out.println(sb1.reverse());
	    System.out.println(sb1.replace(6, 11, "JAVA-MS"));
	    String str1 = "dabangg";
	    StringBuffer sb2 = new StringBuffer();
	    sb2.append(str1);
	    System.out.println(sb2);
	    String str2 = sb2.toString();
	    System.out.println(str2);
	    StringBuilder builder = new StringBuilder();
	    builder.append("abcd");
	}

}

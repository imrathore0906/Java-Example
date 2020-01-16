package practice;

public class StringOperations {

	public static void main(String[] args) {
		String str = "Shravya";
		System.out.println("length "+str.length());
		System.out.println(str.lastIndexOf('a'));
        System.out.println(str.charAt(5));
        System.out.println(str.isEmpty());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("Boorugu"));
        System.out.println(str);
        System.out.println(str.compareTo("deloitte"));
        System.out.println(str.equals("Shravya"));
	}

}

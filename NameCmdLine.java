package practice;

public class NameCmdLine {

	public static void main(String[] args) {
		String name = args[0];
		for(int i=0; i<name.length(); i++){
		System.out.println(name.charAt(i));
		}
		
		for(int i=0; i<=name.length(); i++){
			for(int j=0; j<i; j++){
			    System.out.print(name.charAt(j));
			}
			System.out.println();
		}
		
	}

}

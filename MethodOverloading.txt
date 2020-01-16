package practice;

public class MethodOverloading {
	void add(int x,int y){
		System.out.println("int " + (x+y));
	}
	
	void add(String s1,String s2){
		System.out.println("String "+s1+s2);
	}
	
	void add(double x,double y){
		System.out.println("double "+ (x+y));
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
        m.add("shravya","boorugu");
	}

}

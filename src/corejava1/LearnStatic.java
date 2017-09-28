package corejava1;

public class LearnStatic {
	
	static int x=100;
	static String y="Bharat";
	static double z=10.124;
	
	 static void display(){
		
		System.out.println("Display the value of method");
	}

	public static void main(String[] args) {
		
		//int x=130;
		String y ="Samvida";
		display();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
				
	}

	static{
		
		System.out.println("static block");
	}
}
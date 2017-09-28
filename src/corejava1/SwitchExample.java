package corejava1;

public class SwitchExample {

	public static void main(String[] args) {
		int marks =20;
		
		switch(marks){
		case 40:System.out.println("pass");
		break;
		case 50:System.out.println("second class");
		break;
		case 60:System.out.println("first class");
		default:System.out.println("failed");
		}

		System.out.println("after switching");
	}

}

package corejava1;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int marks =30;
		if(marks>=40 && marks <=50){
			System.out.println("pass");
		}else if(marks>50 && marks<60){
			System.out.println("second grade");
		}else if(marks>60 && marks<70){
			System.out.println("First grade");
		}else if(marks>70 && marks <100){
			System.out.println("distinction");
		}else{
			System.out.println("Failed");
		}
	}

}	
	
	
	
	

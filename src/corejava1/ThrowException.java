package corejava1;

public class ThrowException {
	
	  void vote(int age) {
		if(age<18){
			throw new ArithmeticException();
		}else
			System.out.println("welcome to vote");
				
	}

	public static void main(String[] args) {
		
		ThrowException te = new ThrowException();
		try{
			te.vote(12);
			
		}catch(ArithmeticException e){
			System.out.println("Can not vote due to underage");
		}
		
			System.out.println("Go home after voting");
	}

}

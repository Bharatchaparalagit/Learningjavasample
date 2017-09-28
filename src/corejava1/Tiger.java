package corejava1;

class Animal {
	int weighs =50;
	
	public void eat(){
		
		System.out.println("Animal is eating");
	}
	
	public void sleep(){
		
		System.out.println("Animal is sleeping");
	}
	
	public void noise(){
		System.out.println("Animal is making noise");
	}
	
	public void lives(){
		System.out.println("Lives in forest");
	}
	
}
	class Elephant extends Animal{
		int weighs=200;
		
		public void eat(){
			
			System.out.println("Elephant is eating");
		}
		
		public void sleep(){
			
			System.out.println("Elephant is sleeping");
		}
		
		public void noise(){
			System.out.println("Elephant is making noise");
		}
		
		public void lives(){
			System.out.println("Elephant Lives in forest and weighs " + weighs);
		}

		}
	
	
 class Lion extends Animal {
	
	 int weighs =100;
	 public void eat(){
		
		System.out.println("Lion is eating");
	}
	
	public void sleep(){
		
		System.out.println("Lion is sleeping");
	}
	
	public void noise(){
		System.out.println("Lion is making noise");
	}
	
	public void lives(){
		System.out.println("Lion lives in forest and weighs " + weighs);
	}
	
 }
	
	public class Tiger{
	

	public static void main(String[] args) {
		
		Animal l =new Lion();
		l.eat();
		l.lives();
		l.noise();
		l.sleep();
		
		Animal e = new Elephant();
		e.eat();
		e.lives();
		e.noise();
		e.sleep();
		
					
		}

}
 

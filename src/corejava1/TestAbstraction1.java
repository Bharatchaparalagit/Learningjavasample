package corejava1;

 abstract class shape{
	
	 abstract void draw();
	
 }
 
 class rectangle extends shape{
	 
	 void draw(){
		 System.out.println("drawing rectangle");
	 }
	 
	 
 }
 
 class circle extends shape{
	 void draw(){
		 System.out.println("drawing circle");
	 }
 }
 
public class TestAbstraction1 {

	public static void main(String[] args) {
		
		shape s = new rectangle();
		s.draw();
		
		shape s1 = new circle();
		s1.draw();
		
		

	}

}
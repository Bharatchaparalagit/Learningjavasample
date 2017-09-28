package corejava1;

public class Dog {
	
	String name;

	void bark(){
		
		System.out.println(name + " says wow");
	}
	public static void main(String[] args) {
		
		//int a[] = new int[3];
		Dog Mydogs[] = new Dog[3];
		Dog d1 = new Dog(),d2= new Dog(),d3= new Dog();
		d1.name ="ceaser";
		d2.name ="razor";
		d3.name ="scooby";
		
		Mydogs[0] =d1;
		Mydogs[1] =d2;
		Mydogs[2] =d3;
		
		for(int i=0;i<Mydogs.length;i++){
			
			Mydogs[i].bark();
		}
		

	}

}

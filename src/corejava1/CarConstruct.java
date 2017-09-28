package corejava1;

public class CarConstruct {
	
	int Model;
	String Make;
	String color;
	int kilometers;
	
	public CarConstruct(){
	}
	public CarConstruct(int Model,String Make){
		
		this.Model=Model;
		this.Make=Make;
	}
	public CarConstruct(String color,int kilometers){
		
		this.color=color;
		this.kilometers=kilometers;
	}
	public CarConstruct(int Model,String Make,String color,int kilometers){
		
		this.Model=Model;
		this.Make=Make;
		this.color=color;
		this.kilometers=kilometers;
	}
	public void print(){
		
		System.out.println(Make+" "+Model+" "+color+" "+kilometers);
	}
	
	public static void main(String[] args) {
		
		CarConstruct car1 =new CarConstruct();
		car1.print();
		CarConstruct car2 = new CarConstruct(1999,"Maruti");
		car2.print();
		CarConstruct car3=new CarConstruct("Red",20000);
		car3.print();
		CarConstruct car4=new CarConstruct(1999,"Maruti","Red",20000);
		car4.print();
		
	}

}

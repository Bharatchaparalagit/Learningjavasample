package corejava1;

public class Calc {
	int a=60;
	int b=70;
	int c=100;
	
	void add(){
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
	/*int add(int a,int b){
		return(a+b);
	}
	double add(double a,double b){
		return(a+b);
	}
	
	int add(int a,int b,int c){
		return(a+b+c);
	}*/

	public static void main(String[] args) {
		
		Calc c= new Calc();
		c.add();;
		c.add(20,22,33);;
		
		/*System.out.println(c.add(12,89));
		System.out.println(c.add(31,22,33));
		System.out.println(c.add(12.3,17.8));*/
	}

}

package corejava1;

public class Vari {
	
	int x;
	int y=200;
	static int n=50;

	public static void main(String[] args) {
		Vari v1 = new Vari();
		
		//local variable
		double z = 20.11;
		
		
		
		System.out.println(v1.x);
		System.out.println(v1.y);
		
		System.out.println(z);
		
		//System.out.println(n);
		v1.babu();
		}
		
	public void babu(){
		System.out.println(n);
		
		
	}
}
	
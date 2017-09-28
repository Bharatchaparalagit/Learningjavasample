package corejava1;

interface abcd{
	
	void a();
	void b();
	void c();
	void d();
}

abstract class e implements abcd{
	
	public void a(){
		
		System.out.println("implementing the method a");
		
	}
	
}

class f extends e {

	@Override
	public void b() {
		System.out.println("implementing the method b");
		
	}

	@Override
	public void c() {
		System.out.println("implementing the method c");
		
	}

	@Override
	public void d() {
		System.out.println("implementing the method d");
		
	}
	
	
}

public class TestInterface {

	public static void main(String[] args) {
		
		abcd ab = new f();
		ab.a();
		ab.b();
		ab.c();
		ab.d();
	}

}

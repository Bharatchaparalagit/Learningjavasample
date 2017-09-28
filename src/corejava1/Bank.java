package corejava1;

abstract class srmanager{
	abstract void role();
}

interface manager{
	void duty();
	
}

interface clerk extends manager{
	void cashier();
	
}
public class Bank extends srmanager implements clerk {
	
	@Override
	public void duty() {
		System.out.println("manager will see how bank is functioning");
		
	}

	@Override
	public void cashier() {
		System.out.println("cashier will service the customer transactions in a day");
		
	}

	@Override
	void role() {
		System.out.println("srmanager will conduct meetings with all the employees");
		
	}

	
public static void main(String[] args) {
	
	Bank b= new Bank();
	b.cashier();
	b.duty();
	b.role();
	
		
	}
}

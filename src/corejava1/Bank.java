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
		System.out.println("manager will see how bank is functioning throughout months1");
		
	}

	@Override
	public void cashier() {
		System.out.println("cashier will service the customer transactions in a months1");
		
	}

	@Override
	void role() {
		System.out.println("srmanager will conduct meetings with all the employees in a month1");
		
	}

	
public static void main(String[] args) {
	
	Bank b= new Bank();
	b.cashier();
	b.duty();
	b.role();
	
		
	}
}

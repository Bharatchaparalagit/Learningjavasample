package corejava1;

abstract class sbi {
	
	abstract void rateofinterest();
	
	abstract void minbalance();
	abstract void cashwithdrawl();
}
	
	 class hdfc extends sbi{

		@Override
		void rateofinterest() {
			System.out.println("hdfc Rate of interest is 8.75");
			
		}

		@Override
		void minbalance() {
			System.out.println("hdfc minimum balance is 10000");
			
		}

		@Override
		void cashwithdrawl() {
			System.out.println("hdfc cashwithdrawl limit is 50000");
			
		}
					
		}
		
	
	class icici extends  sbi{

		@Override
		void rateofinterest() {
			System.out.println("icici Rate of interest is 9.00");
			
		}

		@Override
		void minbalance() {
			System.out.println("icici minimum balance is 5000");
			
		}

		@Override
		void cashwithdrawl() {
			System.out.println("icici cashwithdrawl limit is 100000");
			
		}
		
		
	}
		
	public class sbiabstract{

	public static void main(String[] args) {
		
	sbi sbi1 = new hdfc();
	sbi1.cashwithdrawl();
	sbi1.minbalance();
	sbi1.rateofinterest();
	
	sbi sbi2 = new icici();
	sbi2.cashwithdrawl();
	sbi2.minbalance();
	sbi2.rateofinterest();

	}

}


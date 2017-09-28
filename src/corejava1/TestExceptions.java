package corejava1;

public class TestExceptions {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		try{
			
			//System.out.println(i[5])
			
			for (int i=5;i<a.length;i++){
				System.out.println(a[i]);
			}
						
		}catch(NullPointerException e){
			System.out.println("hello baby");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
		System.out.println("Hello Array!");
		System.out.println("Hello everbody");
	}
		
  	
	}
}
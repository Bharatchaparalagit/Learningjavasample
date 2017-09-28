package corejava1;

public class LabelledforLoop {

	public static void main(String[] args) {
		
		a:
			for(int i=0;i<3;i++){
				
				b:
					for (int j=0;j<3;j++){
						System.out.println(i+ " "+j);
						if(i==1 && j==1)
							break a;
					}
						System.out.println("**************");
			}
				
	}

}

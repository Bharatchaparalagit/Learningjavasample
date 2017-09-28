package corejava1;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1="qaplanet";
		String s2="qaplanet";
		String s3=new String("qaplanet");
		String s4="QAPLANET";
		String s5="Sachin";
		String s6="Rahul";
		
		/*//equals() method....
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		*/
		// == operator
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		
		//compareTo() method
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		System.out.println(s5.compareTo(s6));
		System.out.println(s6.compareTo(s5));

	}

}

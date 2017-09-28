package corejava1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections {

	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("Bharat");
		al.add("lucky");
		al.add("suji");
		al.add("sam");
		al.add("samvidha");
		
		/*Iterator itr =al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
			}*/
		
		for (String s:al){
			System.out.println(s);
		}
		}

}

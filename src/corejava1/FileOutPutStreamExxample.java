package corejava1;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutPutStreamExxample {

	public static void main(String[] args) throws IOException {
		/*try{
			FileOutputStream fout =new FileOutputStream("E:\\testout1.txt");
			String s="65";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			
			System.out.println("Success");
		
		}catch(Exception e){
			System.out.println(e);
		}*/
				
		/*FileOutputStream fout =new FileOutputStream("E:\\testout4.xls");
		String s="Welcome to selenium";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		
		System.out.println("Success");
*/
		
		FileWriter fw =new FileWriter("E:\\Lucky.doc");
		fw.write("My name is Lucky");
		fw.close();
		
	}

}

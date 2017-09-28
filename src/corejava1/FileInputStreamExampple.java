package corejava1;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamExampple {

	public static void main(String[] args) throws IOException {
		
		/*FileInputStream fin =new FileInputStream("E:\\testout1.txt");
		int i= fin.read();
		System.out.println((char)i);
		
		fin.close();*/
		
		/*FileInputStream fin =new FileInputStream("E:\\testout3.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
						
		}
		fin.close();*/
		
		FileReader fr=new FileReader("E:\\Lucky.doc");
		int i=0;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
			
		}
		
		fr.close();
	}

	
}

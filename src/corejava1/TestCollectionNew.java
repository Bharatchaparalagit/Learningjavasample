package corejava1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	public static Object itr;
	int rollno;
	String name;
	String standard;
	int age;
	
	public Student(int rollno,String name,String standard,int age){
		
		this.rollno=rollno;
		this.name=name;
		this.standard=standard;
		this.age=age;
		
	}
	
}
public class TestCollectionNew {

	

	public static void main(String[] args) {
		
		Student s1 =new Student(1,"bharat","Engg",36);
		Student s2 =new Student(2,"suji","mca",32);
		Student s3 =new Student(3,"sam","justborn",0);
		
		/*ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr =al.iterator();
		while(itr.hasNext()){
		Student st=(Student)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.standard+" "+st.age);
		
		if(st.rollno==3){
			System.out.println(st.name);
			System.out.println(al.indexOf(st));
		}*/
		
		Set<Student> s=new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		Iterator<Student> itr = s.iterator();
		while(itr.hasNext()){
			Student st =(Student).itr.next();
			System.out.println(st.rollno+ " "+st.name+" "+st.age);
		}
		
		
		}
		
	}



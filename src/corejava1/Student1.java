package corejava1;

public class Student1 {
	
	int rollno;
	String name;
	String city;
	static String college="IIT";
		
	//default constructor
	public Student1(){
		
	} 
	
	//parameterized constructor...
	public Student1(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	//overloaded constructor
	public Student1(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		
		}
	
	void print() {
		System.out.println(rollno+" "+name+" "+city+" "+college);
		
	}

	static void change(){
		college="VIT";
	}
		
	
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.print();  // 0 null,null
		
		Student1 s2=new Student1(111,"bharat");
		s2.print();  //1111, rasagnya,null
		
		Student1 s3=new Student1(2222,"Sowjanya","Hyderabad");
		s3.print();  //2222,sowjanya, hyderabad..
		
		
		
		change();
		s1.print();
		s2.print();
		s3.print();
		
		System.out.println(college);
	}
static{
		
		System.out.println("welcome to freshers of " + college);
	}
	
}


public class Student {
	int id;
	String name;
	String Village;
	String Class;
	String College;
	 
	
	public void GetInfo() {
		System.out.println("Student id is - " + id);
		System.out.println("Student name is - " + name);
		System.out.println("Student Village is - " + Village);
		System.out.println("Student Class is - " + Class);
		System.out.println("Student College is  - " + College);
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Abhijit_Pandey";
		s1.Village = "Phakila";
		s1.Class = "BCA";
		s1.College = "SP JAIN COLLEGE SASARAM";
		s1.GetInfo();
	
		
		
		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Abhiseck";
		s2.Village = "SASARAM";
		s2.Class = "B.SC";
		s2.College = "Delhi";
		s2.GetInfo();
		 

	}

}

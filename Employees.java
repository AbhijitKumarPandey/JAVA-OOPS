//class Employee{
	 
public class Employees {
	int id ;
	String name;
	String Job_title;
	String Company;
	double Salary;
	
	public void printDetails() {
		System.out.println("My Id is -  " + id);
		System.out.println("My Name is - " + name);
		System.out.println("My Job_title - " + Job_title);
		System.out.println("My Company is - " + Company);
		System.out.println("My Salary is - " + Salary);
		
	}
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.id = 1;
		e1.name = "Abhijit_Pandey";
		e1.Job_title = "Kuch_Na";
		e1.Company = "XYZ";
		e1.Salary = 00;
		e1.printDetails();
	}
}



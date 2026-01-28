import java.util.Scanner;
// class creation
class Student{
	int id;
	String name;
	
	int Age;
	// method creation
	void DisplayDetails(){
		String Status = "Active";
		System.out.println("Student id: " +id);
		System.out.println("Student name: " +name);
		System.out.println("Age " +id);
		System.out.println("Status:  " +Status);
	}
	// object creation
	public static void main (String args[]){
		Student s1 = new Student();
		s1.DisplayDetails();
	}
}
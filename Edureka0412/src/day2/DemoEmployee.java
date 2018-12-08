package day2;

public class DemoEmployee {

	public static void main(String[] args) {
	
	// Declaring a variable
	Employee Munah;
	
	//Instantiation and Initialization
	Munah = new Employee();
	
	Munah.salary = 70000;
	Munah.bonus = 8000;
	
	Munah.calculateSalary();
	
	//Second Employee
	//---------------------------------
	Employee John;
	
	//Instantiation and Initialization
	John = new Employee();
	
	John.salary = 170000;
	John.bonus = 18000;
	
	John.calculateSalary();

	}

}

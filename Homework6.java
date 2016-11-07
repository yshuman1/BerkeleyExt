/*
Student: s07ys, Yasin Shuman
	Homework 6
	Usage: java Homework6
	Expected output:
	A new employee record has been created.
	Current salary is $600.0
	Health insurance has been added. 
	Employee salary is 540.0
*/
// create class with overloaded constructors and methods
class Employee {
	String employeeName;
	double employeeWage;
	boolean healthInsurance;
// basic constructor 
	public Employee(){
		this.healthInsurance = false;
		this.employeeWage = 15.00;
		System.out.println("A new employee record has been created.");
	}
// constructor which takes an employee name as the parameter
	public Employee(String employeeName) {
		this();
		this.employeeName = employeeName;
		System.out.println("The name of the employee is " + employeeName);
	}
// constructor which takes in employee name and their wage
	public Employee(String employeeName, double employeeWage) {
		this(employeeName);
		this.employeeWage = employeeWage;
		System.out.println("Employee wage has been set to " + employeeWage);
	}
// constructor which takes employee object and creates a duplicate 
	public Employee(Employee duplEmployee) {
		employeeName = duplEmployee.employeeName;
		employeeWage = duplEmployee.employeeWage;
		healthInsurance = duplEmployee.healthInsurance;
	}
// method which returns the employees name
	public String getName() {
		return employeeName;
	}
// method which changes boolean value of healthInsurance field to true
	public void provideInsurance() {
		healthInsurance = true;
		System.out.println("Health insurance has been added. ");
	}
// method which takes in paramater of hours worked and returns amount of employee salary by multiplying their hours worked by their salary
	public double getSalary(int hours) {
		double employeeSalary = employeeWage * hours;
		System.out.println("Current salary is $" + employeeSalary);
		return employeeSalary;	
	}
// overloaded method which takes paramater of hours worked as well as boolean value of healthInsurance. if healthIsnurance is set to true, the method will adjust employee salary to be 10% less. If it is set to false then, this method will add insurance and then make the salary 90%. 
// I know this method is idempotent (i just learned about that from my employeee lol, im hoping for the purpose of this assignment it is acceptable and am aware it is not best practice to have a getter method like this) 	
	public double getSalary(int hours, boolean healthInsurance) {
		if (healthInsurance) {
			this.provideInsurance(); 
		} else { 
			return this.getSalary(hours); 
	  	} 
		double employeeSalary = (employeeWage * hours) * .90;
		System.out.println("Employee salary is " + employeeSalary);
		return employeeSalary;
	}
}
//in the main method, an Employee object is created, then two overloaded methods are called first the one which takes in hours as the parameter
//then the second method is called with the paramaters for hours and the boolean value of healthInsurance. a description of each method can be found above the respective method
public class Homework6 {
	public static void main(String[] args) {
		Employee Yasin = new Employee();
		Yasin.getSalary(40);
		Yasin.getSalary(40, true);
	}
}
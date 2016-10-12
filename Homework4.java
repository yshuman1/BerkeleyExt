/*
Student: s07ys, Yasin Shuman
	Homework 4
	Usage: java Homework4
	Expected output:
		This semester Mr. Walter White will be teaching Chemistry
		The school id for Mr. Walter White is 2123
		Jesse Pinkman attends Pine Elementary and has a current grade of C
*/
//create 2 classes Teacher & Student
// !! be consistent with the number of spaces before { and one space is enough
class Teacher {
	//create an instance variable
	String name;
	//create a class variable
	// !! but we only use all caps for a final variable (constant)
	static int school_id = 2123;
	//create a parameterized constructor that takes in a string as an argument and assigns it to the instance variable
	public Teacher(String name) {
		this.name = name;
	}
	//create a parameterized method that takes in a string argument and prints out a message
	public void teach(String subject) {
		System.out.println("This semester " + name + " will be teaching " + subject);
	}

}
class Student {
	//create an instance variable
	String name;
	//create a class variable
	static String school_name = "Pine Elementary";
	//create a parameterized constructor that takes in a string as an argument and assigns it to the instance variable
	public Student(String name) {
		this.name = name;
	}
	//create a parameterized method that takes in an int argument and returns char variable grade
	public char getGrade(int marks) {
		char grade;
		if (marks >= 80) {
			grade = 'A';
		} else if (marks >= 60 && marks < 80) {
			grade = 'B';
		} else if (marks >= 40 && marks < 60) {
			grade = 'C';
		} else {
			grade = 'D';
		}	return grade;
	} // !! not correct to have } and } on two lines with the same amount of indent
}
/*create third class which contains the main method and instantiates the two classes
from above by calling their paramterized constructors
*/
public class Homework4 {
	public static void main(String[] args) {
		Teacher chemProf = new Teacher("Mr. Walter White");
		chemProf.teach("Chemistry");
		System.out.println("The school id for " + chemProf.name + " is " + Teacher.school_id);
		Student badStudent = new Student("Jesse Pinkman");
		char grade = badStudent.getGrade(53);
		// !! fix the name of the static variable to not be all caps
		System.out.println(badStudent.name + " attends " + Student.school_name + " and has a current grade of " + grade);

	}
}
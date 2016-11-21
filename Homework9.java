/*	Student: s07ys, Yasin Shuman
	Homework 9
	Usage: java Homework9
	Sample output:  
		Welcome to Homework 9!
		Please type your first name: ee
		Thank you ee! Now, let's get this exception party started!
		Please provide us with your birth year in 4 digit format. Ex: 1978
		2222
		Awesome you were born in 2222
		Lets now cause an arithmetic exception by trying to divide 3 by 0
		Success! We just caused an arithmetic exception.
		Here are the details: java.lang.ArithmeticException: / by zero
Special note -> This program has multiple possible outputs depending on the year of the user.
*/
import java.util.Scanner;

class MyCustomException extends Exception {
	MyCustomException() {
		System.out.println("MyCustomException has been thrown.");
	}
}

class Homework9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to Homework 9!\nPlease type your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Thank you " + firstName + "! Now, let's get this exception party started!");


		try {
			System.out.println("Please provide us with your birth year in 4 digit format. Ex: 1978");
			String birthYear = sc.nextLine();
			
			if (birthYear.length() < 4) {
				throw new MyCustomException();
			} else {
				System.out.println("Awesome you were born in " + birthYear);
				System.out.println("Lets now cause an arithmetic exception by trying to divide 3 by 0");
				int divideByZero = 3/0;
			}
		}
		catch(MyCustomException e) {
      	}
      	catch(ArithmeticException e){
      		System.out.println("Success! We just caused an arithmetic exception.\nHere are the details: " + e);
      	}
	}
}
/*	Student: s07ys, Yasin Shuman
	Homework 2
	Usage: java Homework2
	Sample output:  
					Welcome to age verification!
					Please type in the year you were born: 2001
					Please type the current year: 2016
					What is the legal age to buy tobacco in your state? 21
					What is the legal age to buy alcohol in your state? 10
					You can buy alcohol but not tobacco.
Special note -> This program has multiple possible outputs depending on the age of the user and the legal age to buy alcohol or tobacco.
*/
	
import java.util.Scanner;

class Homework2 
{
	public static void main(String[] args)
	{
// initialize new scanner and variables to hold values for birth year of user as well as current year
		Scanner sc = new Scanner(System.in);	
		System.out.println("Welcome to age verification!");
		System.out.print("Please type in the year you were born: ");
		int birthYear = sc.nextInt();
		System.out.print("Please type the current year: ");
		int currentYear = sc.nextInt();
// check to make sure input was properly entered. the if statement check to make sure birth year isnt later than the current year
		if (birthYear > currentYear) {
			System.out.println("Uh oh, somethings not right!");
			return;
		}
/* next user is prompted for the legal ages to buy tobacco and alcohol in their state. these values are stored in 2 separate variables
   next age is calculated and stored into variable "age"
*/		
		System.out.print("What is the legal age to buy tobacco in your state? ");
		int tobaccoAge = sc.nextInt();
		System.out.print("What is the legal age to buy alcohol in your state? ");
		int alcoholAge = sc.nextInt();
		int age = currentYear - birthYear;
//system checks if user is old enough to purchase tobacco or alcohol and prints output accordingly		
		if (alcoholAge > age && tobaccoAge > age) {
			System.out.println("Grow up kid! You are not old enough to buy that stuff!");
		} else if (tobaccoAge > age && age >= alcoholAge) {
			System.out.println("You can buy alcohol but not tobacco.");
		} else if (alcoholAge > age && age >= tobaccoAge) {
			System.out.println("You can buy tobacco but not alcohol. ");
		} else {
			System.out.println("We're sorry you're SO OLD but you're free to buy whatever you like.");
		}
	}
}
/*
  	Student: Yasin Shuman
  	usage: java Homework1 First Name Last Name
 	Expected Output: 
  		Hi (First Name) (Last Name) the modulo of 19 and 2 is: 1

		Let's tab	over	twice here because I didnt know what else to do with the tabs. 
*/

<<<<<<< HEAD
class Homework1	{	
	public static void main(String[] args) {
	
	/*  Check if arguments are present
	* 	If arguments are present and formatted properly will proceed to doing math 
	*/ 
	if (args.length == 0) {
		System.out.print("You forgot to type in your first and last name when you ran this program." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again.");
		return;
	} else if (args.length != 2) {
		System.out.println("Uh Oh! It doesn't look like your formatting is correct." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again." + "\n"); 
		return;
	} 

	/*  takes two int variables a and b and finds the modulo and assigns it to variable c 
	*	it then prints out a message giving the user the modulo as well as demonstrating that i know how to use the escape sequences \n and \t 
	*/
	
	int a = 9;
	int b = 2;	
	String str = " the modulo of 9 and 2 is: ";
		
	int c = a % b;
	
	System.out.println(" \n" + "Hi " + args[0] + " " + args[1] + str + c + "\n" + "\n" + "Let's tab\tover\ttwice here because I didnt know what else to do with the tabs." + "\n");
		
		//testing git
||||||| merged common ancestors
class Homework1	{	
	public static void main(String[] args) {
	
	/*  Check if arguments are present
	* 	If arguments are present and formatted properly will proceed to doing math 
	*/ 
	if (args.length == 0) {
		System.out.print("You forgot to type in your first and last name when you ran this program." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again.");
		return;
	} else if (args.length != 2) {
		System.out.println("Uh Oh! It doesn't look like your formatting is correct." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again." + "\n"); 
		return;
	} 

	/*  takes two int variables a and b and finds the modulo and assigns it to variable c 
	*	it then prints out a message giving the user the modulo as well as demonstrating that i know how to usethe escape sequences \n and \t 
	*/
	
	int a = 9;
	int b = 2;	
	String str = " the modulo of 9 and 2 is: ";
		
	int c = a % b;
	
	System.out.println(" \n" + "Hi " + args[0] + " " + args[1] + str + c + "\n" + "\n" + "Let's tab\tover\ttwice here because I didnt know what else to do with the tabs." + "\n");
		
		//testing git
=======
class Homework1	
{	
	public static void main(String[] args) 
	{	
		/*  
			Check if arguments are present
		    If arguments are present and formatted properly will proceed to doing math 
		*/
		if (args.length == 0) {
			System.out.print("You forgot to type in your first and last name when you ran this program." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again.");
			return;
		} else if (args.length != 2) {
			System.out.println("Uh Oh! It doesn't look like your formatting is correct." + "\n" + "This is the format you need: Java Homework1 (First Name) (Last Name)" + "\n" + "Go ahead and try it again." + "\n"); 
			return;
	 	}

		/*  
			takes two int variables a and b and finds the modulo and assigns it to variable c 
			it then prints out a message giving the user the modulo as well as demonstrating that i know how to use the escape sequences \n and \t 
		*/
		int a = learnMethod(9);
		int b = 2;	
		String str = " the modulo of " + a + " and " + b + " is: ";
			
		int c = a % b;
>>>>>>> testing-git
		
		System.out.println(" \n" + "Hi " + args[0] + " " + args[1] + str + c + "\n" + "\n" + "Let's tab\tover\ttwice here because I didnt know what else to do with the tabs." + "\n");	
	}

	//Method that adds 10 to a number. I wanted to learn how to use methods with a return type.
	public static int learnMethod(int num)
	{
		int sum = 10 + num;
		return sum;
	}
}









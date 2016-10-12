/*
Student: s07ys, Yasin Shuman
	Homework 3
	Usage: java Homework3
This homework demonstrates the following:	
if ...else if ... else if ... else
for loop
do-while loop
switch
Sample output:
	Hi! Whats your name? joe
	Hi joe! Let's get Started
	I'm a small program that proves that Yasin has learned the lesson even though he missed the last lecure. 
	First, I'm going to count to 10 using a while loop. Hit enter to be amazed!
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	Wasn't that awesome? Next, we will have fun with switch Statements.
	To learn a fun fact about George Washington enter 1.
	To learn a fun fact about Abe Lincoln enter 2.
	To learn a fun fact about Harambe enter 3.
	Your choice: 1
	George Washington was a tax cheat. Who led a revolution to evade british taxes. Traitor!
	Okay joe now we will demonstrate a for loop by counting from 0 to 50 listing only even numbers.
	Hit enter to see the magic!
	0
	2
	4
	6
	8
	10
	12
	14
	16
	18
	20
	22
	24
	26
	28
	30
	32
	34
	36
	38
	40
	42
	44
	46
	48
	50
	Finally, we will have fun with if else statments. They are my favorite...How can I properly express sarcasm here?
	Do you think I'm funny?
	Rank me on a scale of 1 to 5: 1
	Whatever, you probably think Adam Sandler movies are good.
*/
import java.util.Scanner;
class Homework3
{
	public static void main(String[] args)
	{	//ask user name, and demonstrate while loop
		Scanner sc = new Scanner(System.in);
		System.out.print("Hi! Whats your name? ");
		String name = sc.next();
		System.out.println("Hi " + name + "! Let's get Started");
		System.out.println("I'm a small program that proves that Yasin has learned the lesson even though he missed the last lecure. ");
		System.out.println("First, I'm going to count to 10 using a while loop. Hit enter to be amazed!");
		sc.nextLine();
		sc.nextLine();
		//will print 1 - 10
		int count = 1;
		do {
     		System.out.println( count );
     		count++;
		} while (count <= 10);
		String funFact = "To learn a fun fact about ";
		System.out.println("Wasn't that awesome? Next, we will have fun with switch Statements.\n");
		//demo switch statement
		System.out.print(funFact + "George Washington enter 1.\n" + funFact + "Abe Lincoln enter 2.\n" + funFact + "Harambe enter 3.\nYour choice: ");

		int pres = sc.nextInt();

		switch (pres){

			case 1: System.out.println("George Washington was a tax cheat. Who led a revolution to evade british taxes. Traitor!\n");
			break;
			case 2: System.out.println("Abe Lincoln didnt like black people.\nHe Said: \"I will say then that I am not, nor ever have been in favor of bringing about in any way the social and political equality of the white and black races.\"\n");
			break;
			case 3: System.out.println("HaHa Harambe wasnt a president but I think he would have been a better choice than Hillary or Trump. #DicksOutForHarambe (dumb hashtag I know...couldnt help it)\n");
			break;
			default: System.out.println("Wrong Answer! You were supposed to choose 1, 2 or 3.\n");
			break;
		}
		System.out.println("Okay " + name + " now we will demonstrate a for loop by counting from 0 to 50 listing only even numbers.");
		System.out.print("Hit enter to see the magic!");
		sc.nextLine();
		sc.nextLine();
		// will count ot 50 with even numbers
		for (int number = 0; number <= 50; number +=2){
			System.out.println(number);
		}
		System.out.println("\nFinally, we will have fun with if else statments. They are my favorite...How can I properly express sarcasm here?");
		System.out.print("Do you think I'm funny?\nRank me on a scale of 1 to 5: ");
		int funny = sc.nextInt();
		//some lame jokes as 
		if (funny >= 1 && funny <= 3 ) {
			System.out.println("Whatever, you probably think Adam Sandler movies are good.");
		} else if (funny >= 4 && funny <= 5){
			System.out.println("I am friggin Hilarious! Sadly, nothing is as funny as my inability to code well.");
		} else {
			System.out.println("That's not a number 1 to 5!");
		}
	}
}
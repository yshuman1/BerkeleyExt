/*
Student: s07ys, Yasin Shuman
	Homework 8
	Usage: java AnimalDemo
	Expected output:
		The cat is now eating.
		Meow Meow
		The dog is now eating.
		Woof Woof
*/
//creates array of type Animal with 2 element capacity
//creates two objects one from cat class and one from dog class. 
//places new objects in array and calls on methods of each class using for each loop		
class AnimalDemo {
	public static void main(String[] args) {
		Animal[] pets = new Animal[2]; 
		pets[0] = new Cat();
		pets[1] = new Dog();

		for (Animal a : pets) {
			a.eat();
			a.speak();
		}
	}
}
/*
/*
Student: s07ys, Yasin Shuman
	Homework 7
	Usage: java Homework7
	Expected output:
		The tax due on NewYorkStateRestaurant is $11.60.
		The tax due on NewYorkCityRestaurant is $37.33.
*/
// created abstract class with an abstract method calculateTax and non abstract method getPreTaxPrice
abstract class AbstractRestaurant { 
	double taxRate;
	double[] itemList = {79.99,15.00,15.00,89.99,59.99,30.00};
	
	AbstractRestaurant(double taxRate) {
		this.taxRate = taxRate;
	}

	abstract double calculateTax();
	
	double getPretaxPrice(double[] itemList) {
		double tally = 0;
		for(double orderItem: itemList) {
			tally += orderItem;
		}
		//should return a value for tally of 289.97
		return tally;
	}
}	
// created a subclass NewYorkStateRestaurant which implements calculateTax method with rate of 4%
class NewYorkStateRestaurant extends AbstractRestaurant {
	
	NewYorkStateRestaurant() {
		super(0.04);
	}

	NewYorkStateRestaurant(double taxRate) {
		super(taxRate);
	}

	double calculateTax() {
		return taxRate * super.getPretaxPrice(itemList);
	}
}
// created a subclass NewYorkCityRestaurant that overrides calculateTax
class NewYorkCityRestaurant extends NewYorkStateRestaurant {
	
	double calculateTax() {
		return 0.08875 * super.getPretaxPrice(itemList);
	}

	double combineTax() {
		return this.calculateTax() + super.calculateTax();
	}
} 
public class Homework7 {
	public static void main(String[] args) {
		NewYorkStateRestaurant hillarysCafe = new NewYorkStateRestaurant();
		System.out.printf("The tax due on NewYorkStateRestaurant is $%.2f.\n", hillarysCafe.calculateTax());
		NewYorkCityRestaurant trumpsTexMexDiner = new NewYorkCityRestaurant();
		System.out.printf("The tax due on NewYorkCityRestaurant is $%.2f.\n", trumpsTexMexDiner.combineTax());
	}
}





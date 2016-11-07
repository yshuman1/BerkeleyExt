/*
Student: s07ys, Yasin Shuman
    Homework 5
    Usage: java StringDemo
    Expected output:
        90999 is not a valid number.
        1234567890 is not a valid number.
        600-8772
        944-0400
        846-8046
        979-1419
        This entry contains a single word.
        This entry contains multiple words.
*/
//create class with two methods. first method calls String methods on an array of type String with at least two (2) String method calls being INSIDE a for-each loop
class StringManipulator {
    public void checkNumber(String[] phoneNumbers) {
        for (String number : phoneNumbers) {
            if(number.length() == 7 || number.charAt(3) == '-') {
                if(number.charAt(3)=='-')  {
                    System.out.println(number);
                } else {
                    System.out.println(number.substring(0,3) + "-" + number.substring(3,7));
                }
            } else{
                System.out.println(number + " is not a valid number.");
            }
        }
    }
    //method with at least two (2) String methods on individual Strings that are not in a String array.
    public void checkMultipleWordsInString(String entry){
        entry = entry.trim();
        if (entry.contains(" ")) {
            System.out.println("This entry contains multiple words.");
        }else {
            System.out.println("This entry contains a single word.");
        }
    }
}
//create StringDemo class with the main method that calls the methods of your StringManipulator class. 
public class StringDemo {
    public static void main(String[] args) {
        String[] phoneList = {"90999", "1234567890", "6008772", "944-0400", "846-8046", "9791419"};
        StringManipulator manipulator = new StringManipulator();
        manipulator.checkNumber(phoneList);
        String word1 = "   tutor    ";
        String word2 = "Learning Java while watching Pirates of the Caribbean   ";
        manipulator.checkMultipleWordsInString(word1);
        manipulator.checkMultipleWordsInString(word2);
    }
}
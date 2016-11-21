/*  Student: s07ys, Yasin Shuman
    Homework 10
    This program will compare 2 files and if there are any differences it will tell you where the first difference are by character position as well as the values that differ in each file.
    Usage: java Homework10 (name of first file) (name of second file)
    Sample output 1:  If both files are identical:

    We will look for differences between Lorem_ipsum.txt and Lorem_ipsum.txt.
                         xxxxxxx 
                        x     x  
                       x     x   
                      x     x    
       xxxxxx        x     x     
        x    x      x     x      
         x    x    x     x       
          x    x  x     x        
           x    xx     x         
            x         x          
             x       x           
              xxxxxxx            

    Woohoo! These files are identical.

    Sample output 2:  If both files are different:
    
    These two files differ at character 78.
    The file named Lorem_ipsum.txt says: N but the file named Lorem_ipsum2.txt says: U.               
*/
import java.io.*;
class Homework10 {
    public static void main(String[] args) {
        System.out.println("We will look for differences between " + args[0] + " and " + args[1] + ".");
        int a=0, b=0;
        FileInputStream file1;
        FileInputStream file2;
        // First make sure that both files have been given.
        if(args.length !=2 ) {
            System.out.println("Usage: CompFile file1 file2");
            return;
        }
        //open first file
        try {
            file1 = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException exc) {
            System.out.println(args[0] + " File Not Found");
            return;
        }
        // open second file
        try {
            file2 = new FileInputStream(args[1]);
        }
        catch(FileNotFoundException exc) {
            System.out.println(args[1] + " File Not Found");
            // Close the first file if the second file cant be opened
            try {
                file1.close();
            }
            catch(IOException exc2) {
                System.out.println("Cannot close " + args[0]);
            }
            return;
        }
        
        try {
          do {
            a = file1.read();
            b = file2.read();
            if(a != b) break;
          } while(a != -1 && b != -1);
          
          if(a != b) {
            System.out.println("These two files differ at character " + a + ".\nThe file named " + args[0] +" says: " + (char)a + " but the file named " + args[1] + " says: " + (char)b + ".");
          } else {
            System.out.println("                     xxxxxxx ");
            System.out.println("                    x     x  ");
            System.out.println("                   x     x   ");
            System.out.println("                  x     x    ");
            System.out.println("   xxxxxx        x     x     ");
            System.out.println("    x    x      x     x      ");
            System.out.println("     x    x    x     x       ");
            System.out.println("      x    x  x     x        ");
            System.out.println("       x    xx     x         ");
            System.out.println("        x         x          ");
            System.out.println("         x       x           ");
            System.out.println("          xxxxxxx            ");
            System.out.println("\nWoohoo! These files are identical.");
             }   
        }
        catch(IOException exc) {
            System.out.println("There is an IOException");
        }
        
        try {
            file1.close();
        }
        catch(IOException exc) {
            System.out.println("There is an error closing " + args[0]);
        }
        
        try {
            file2.close();
        }
        catch(IOException exc) {
            System.out.println("There is an error closing " + args[1]);
        }
    }
}
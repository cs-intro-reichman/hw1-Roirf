// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class Demo0 {
    // The class name as to be the same as the file name.
	public static void main(String[] args) {
        //changing "main" to "man" will not show any error on screen but the program will not run. on the Terminal tab in will show the main method not found.
		// Declares an int variable, and sets it to 1
        int i = 0;
        // Complete the program's code here:
        while (i < 6 ) {
            System.out.println(i) ;
            //removing the semicolon at the end of the line will cause a compile error.
            // printline is not the correct spelling, it should be println.
            // print line without the System.out. will not compile.

            i = i +1;
            // changing the + to * will cause an infinite Loop that will keep printing 0.
        }
        System.out.println("Done") ;
        // The quatation mark are necessary to close the massage string.
        // without them, the program will not compile but it will not be marked in "orange" if u missing both.
    } 
    // removing the closing curly brace here will cause an error on the body of the class and will not compile.
 }
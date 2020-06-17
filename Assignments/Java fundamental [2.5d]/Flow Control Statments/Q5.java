/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
===============================================================*/






import java.io.*;
import java.util.*;

public class Q5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		if(Character.isDigit(c1)) {
			System.out.println("Digit");
		}
		else if(Character.isLetter(c1)){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Character");
		}
	}

}


/*Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
============================================================================*/

import java.io.*;
import java.util.*;

public class Q7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		if(Character.isUpperCase(c1)) {
			System.out.println(Character.toLowerCase(c1));
		}
		else {
			System.out.println(Character.toUpperCase(c1));
		}
	}

}

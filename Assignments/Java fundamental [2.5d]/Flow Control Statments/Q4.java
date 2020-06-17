/*Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
==========================================================================================*/



import java.io.*;
import java.util.*;

public class Q4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char c1 = input.next().charAt(0);
		System.out.println("Enter Character: ");
		char c2 = input.next().charAt(0);
		
		if(c1<c2) {
			System.out.println(c1+","+c2);
		}
		else {
			System.out.println(c2+","+c1);
		}
	}

}

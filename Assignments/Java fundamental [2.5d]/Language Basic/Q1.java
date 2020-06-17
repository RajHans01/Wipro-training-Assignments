/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line] */
================================================================================

import java.io.*;
import java.util.*;

public class Twostring {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = input.nextLine();
		System.out.println("Enter String: ");
		String s2 = input.nextLine();
		System.out.println(s1 +" Technologies "+s2);
	}

}

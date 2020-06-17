/* Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)
C:\> java Sample John
O/P Expected : Welcome John
===================================================================*/
import java.io.*;
import java.util.*;

public class Q2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String s = input.nextLine();
		System.out.println(" Welcome "+s);
	}

}

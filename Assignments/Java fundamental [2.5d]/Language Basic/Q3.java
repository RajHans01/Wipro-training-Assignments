/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
==============================================================*/
import java.io.*;
import java.util.*;

public class Q3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer1: ");
		int num1 = input.nextInt();
		System.out.println("Enter Integer2: ");
		int num2 = input.nextInt();
		System.out.println("The sum of"+num1+" and "+num2+" is "+(num1+num2));
	}

}

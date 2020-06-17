/*Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
==========================================================================================*/

import java.io.*;
import java.util.*;

public class Q14 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an Integer: ");
		int num = input.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
}

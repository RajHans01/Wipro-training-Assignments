/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
==================================================================================*/
import java.io.*;
import java.util.*;

public class Q16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an Integer: ");
		int num = input.nextInt();
		String s1 = String.valueOf(num);
		String result="";
		for(int i=s1.length()-1;i>=0;i--) {
			result+=s1.charAt(i);
		}
		System.out.println(Integer.parseInt(result));
	}
}

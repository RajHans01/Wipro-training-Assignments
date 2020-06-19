 Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
============================================================
import java.io.*;
import java.util.*;
public class Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		int n = str.length();
		String s = str.substring(1,n-1);
		System.out.println(s);
	}
}

Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null
=========================================
import java.io.*;
import java.util.*;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		int n = str.length();
		String s;
		if(n%2==0) {
			s = str.substring(0,n/2);
		}
		else {
			s=null;
		}
		System.out.println(s);
	}
}

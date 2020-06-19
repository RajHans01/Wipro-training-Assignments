Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
=================================================================================================
import java.io.*;
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int n = s.length();
		String sb = s.substring(0,2);
		String result = "";
		while(n>0) {
			result+=sb;
			n--;
		}
		System.out.println(result);
	}
}

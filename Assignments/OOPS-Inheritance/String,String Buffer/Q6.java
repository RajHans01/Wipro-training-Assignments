 Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
=====================================================================================




import java.util.*;
import java.io.*;
public class Q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String1: ");
		String str1 = sc.next();
		System.out.print("Enter a String2: ");
		String str2 = sc.next();
		String result;
		if(str1.length()>str2.length()) {
			result = str2 + str1+ str2;
		}
		else {
			result = str1+str2+str1;
		}
		System.out.println(result);
	}
}

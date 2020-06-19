 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
=====================================================================================
import java.util.*;
import java.io.*;
public class Q7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		String result = str;
		int n = str.length();
		if(str.charAt(0)=='x' && str.charAt(n-1)=='x') {
			result = str.substring(1,n-1);
		}
		System.out.println(result);
	}
}

Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
====================================================================================================
import java.util.*;
import java.io.*;
public class Q9 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Strings seperated by ',': ");
		String[] str = br.readLine().split(",");
		String result = "";
		if(str[0].length()<str[1].length()) {
			for(int i =0;i<str[0].length();i++) {
				result +=str[0].charAt(i);
				result+=str[1].charAt(i);
			}
			result+=str[1].substring(str[0].length());
		}
		else {
			for(int i =0;i<str[1].length();i++) {
				result +=str[0].charAt(i);
				result+=str[1].charAt(i);
			}
			result+=str[0].substring(str[1].length());
		}
		System.out.println(result);
	}
}

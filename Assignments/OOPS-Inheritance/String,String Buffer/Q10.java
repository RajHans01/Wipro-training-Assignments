Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
=====================================================================================================
import java.io.*;
import java.util.*;

public class Q10 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Strings seperated by ',': ");
		String[] str = br.readLine().split(",");
		String s = str[0];
		int n = Integer.parseInt(str[1]);
		int l = s.length();
		String sb = s.substring(l-n);
		String result = "";
		while(n>0) {
			result+=sb;
			n--;
		}
		System.out.println(result);
	}
}

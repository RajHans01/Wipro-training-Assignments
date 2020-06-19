Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
==========================================================================================
import java.io.*;
import java.util.*;

public class Q2 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 2 seperated by ',': ");
		String[] str = br.readLine().split(",");
		String result = "";
		if(str[0].charAt((str[0].length()) -1)==(str[1].charAt(0))) {
			result = str[0].toLowerCase()+str[1].substring(1,str[1].length()).toLowerCase();
		}
		else {
			result = str[0].toLowerCase()+str[1].toLowerCase();
		}
		System.out.println(result);
	}
}

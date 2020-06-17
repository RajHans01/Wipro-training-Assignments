/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
================================================================================================================*/



import java.io.*;
import java.util.*;

public class Q3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size of Array: ");
		int n = input.nextInt();
		System.out.println("Enter Element to Find: ");
		int k = input.nextInt();
		int pos = -1;
		int[] arr = new int[n];
		System.out.println("Enter Array: ");
		for(int i =0;i<n;i++) {
			arr[i] = input.nextInt();
			if(k==arr[i]) {
				pos = i;
			}	
		}
		System.out.println(pos);
	}
}

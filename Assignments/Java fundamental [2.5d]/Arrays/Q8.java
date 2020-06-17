/* Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
=====================================================================*/
import java.io.*;
import java.util.*;

public class Q8 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array with seperated space: ");
		String[] strr = br.readLine().split(" ");
		int[] arr = new int[strr.length];
		for(int i =0;i<strr.length;i++) {
			arr[i] = Integer.parseInt(strr[i]);
		}
		int start = 0;
		int end = 0;
		boolean flag = false;
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i]==6) {
				start = i;
				for(int j = start+1;j<arr.length;j++) {
					if(arr[j]==7) {
						end = j;
						flag = true;
						break;
					}
				}
				break;
			}
		}
			int summ = 0;
			if(flag) {
				for(int p=0;p<start;p++) {
					summ+=arr[p];
				}
				for(int k=end+1;k<arr.length;k++) {
					summ+=arr[k];
				}
			}
			else {
				for(int l=0;l<arr.length;l++) {
					summ+=arr[l];
				}
			}
			System.out.println(summ);			
	}
}

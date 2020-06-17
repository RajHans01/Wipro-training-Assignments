/*Write a program to check if a given integer number is odd or even.
=====================================================================*/


import java.io.*;
import java.util.*;

public class Q2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer1: ");
		int num1 = input.nextInt();
		if((num1&1) == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");}
		}
	}

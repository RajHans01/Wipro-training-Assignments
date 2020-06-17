/*A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
     =============================================================*/
     
    A.  import java.io.*;
            import java.util.*;
public class Q1a {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer: ");
		int num1 = input.nextInt();
		if(num1>0) {
			System.out.println("Positive");
		}
		else if(num1<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");}
		}
	}
  
  ==================================================================
  
  B. import java.io.*;
import java.util.*;

public class Q1b {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer1: ");
		int num1 = input.nextInt();
		System.out.println("Enter Integer2: ");
		int num2 = input.nextInt();
		if(num1%10==num2%10) {
			System.out.println("true");
		}
		else {
			System.out.println("false");}
		}
	}


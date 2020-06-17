/*  Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
===============================================================================*/





import java.io.*;
import java.util.*;

public class Q6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Gender: ");
		String gender = input.nextLine();
		System.out.println("Enter Age: ");
		int age = input.nextInt();
		if(gender=="Female") {
			if(age>=1 && age <=58) {
				System.out.println("Percentage of interest is 8.2%.");
			}
			else {
				System.out.println("percentage of interest is 9.2%.");
			}
		}
		else {
			if(age>=1 && age <=58) {
				System.out.println("Percentage of interest is 8.4%.");
			}
			else {
				System.out.println("percentage of interest is 10.5%.");
			}
		}
	}

}

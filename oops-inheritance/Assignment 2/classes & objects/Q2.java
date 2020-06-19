Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
==============================================================================================
import java.io.*;
import java.util.*;

class Calculator{
	public static int intPower(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double doublePower(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}

public class E2 {
	public static void main(String args[]) {
		System.out.println("Int Power: "+Calculator.intPower(10, 2));
		System.out.println("Double Power: "+Calculator.doublePower(10, 3));
	}
}

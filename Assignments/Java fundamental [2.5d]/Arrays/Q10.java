Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
=======================================================================
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int tmp[] = new int[a.length];
		int count = 0;
		for (int i : a) {
			if (i % 2 == 0) {
				tmp[count] = i;
				count++;
			}
		}
		for (int i : a) {
			if (i % 2 != 0) {
				tmp[count] = i;
				count++;
			}
		}
		for (int i : tmp) {
			System.out.print(i + " ");
		}
	}

}

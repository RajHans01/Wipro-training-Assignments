 Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
===================================================================================

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}
		int c[] = new int[2];
		c[0] = a[1];
		c[1] = b[1];
		for (int i : c) {
			System.out.print(i + " ");
		}
	}

}

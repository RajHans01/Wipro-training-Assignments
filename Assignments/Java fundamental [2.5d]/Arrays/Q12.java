Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
======================================================================================
:        import java.util.Scanner;
                    public class Q11 {
                 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : a) {
			if (i != 1 && i != 4) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);

	}

}

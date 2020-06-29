import java.io.*;
import java.util.Scanner;

public class JavaIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader f = new FileReader("d://javaTest.txt")) {
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			c = Character.toLowerCase(c);
			int count = 0;
			int d = 0;
			while ((d = f.read()) != -1) {
				if (d == c || d == Character.toUpperCase(c)) {
					count++;
				}
			}
			System.out.println("Occurance of " + c + " is " + count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

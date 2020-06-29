import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter input file name : ");
			String path1 = sc.nextLine();
			FileReader f1 = new FileReader(path1);
			System.out.println("Enter output file name : ");
			String path2 = sc.nextLine();
			FileWriter f2 = new FileWriter(path2);
			int d = 0;
			while ((d = f1.read()) != -1) {
				f2.write(d);
			}
			System.out.println("File copied successfuly...");
			f1.close();
			f2.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

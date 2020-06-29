import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	String name;
	Date dob;
	String department;
	String designation;
	double salary;

	public Employee() {
		super();
	}

	public Employee(String name, Date dob, String department, String designation, double salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

import java.io.*;
import java.util.Date;

public class JavaIO4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fileOut = new FileOutputStream("d://empDetails.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fileOut);
		Employee e = new Employee("RajHans", new Date(), "Development", "Manager", 5000000);
		ois.writeObject(e);
		System.out.println("Object Written successfully...");
		FileInputStream fileIn = new FileInputStream("d://empDetails.txt");
		ObjectInputStream os = new ObjectInputStream(fileIn);
		e = (Employee) os.readObject();
		System.out.println("Name : " + e.getName());
		System.out.println("Date of birth : " + e.getDob().toLocaleString());
		System.out.println("Department : " + e.getDepartment());
		System.out.println("Designation : " + e.getDesignation());
		System.out.println("Salary : " + e.getSalary());
	}

}

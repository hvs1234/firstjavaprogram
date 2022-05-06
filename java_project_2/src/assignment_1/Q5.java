package assignment_1;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		String Name, Department;
		int age;
		double salary;
		double total = 0.0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter the Name: ");
			Name = s.next();
			System.out.println("Enter the Department: ");
			Department = s.next();
			System.out.println("Enter the age: ");
			age = s.nextInt();
			System.out.println("Enter the salary: ");
			salary = s.nextDouble();
			Employee obj = new Employee(Name, Department, age, salary);
			obj.display();
			total += salary;
		}
		System.out.println("Total Salry is: " + total);
	}

}

class Employee {
	String Name, Department;
	int age;
	double salary;

	Employee(String Name, String Department, int age, double salary) {
		this.Name = Name;
		this.Department = Department;
		this.age = age;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + Name);
		System.out.println("Department: " + Department);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}

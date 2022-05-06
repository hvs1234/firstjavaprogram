package assignment_1;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		String Name, section;
		int age;
		double percentage;
		double avg;
		Scanner s = new Scanner(System.in);
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj1 = new Student(Name, section, age, percentage);
		obj1.display();
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj2 = new Student(Name, section, age, percentage);
		obj2.display();
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj3 = new Student(Name, section, age, percentage);
		obj3.display();
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj4 = new Student(Name, section, age, percentage);
		obj4.display();
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj5 = new Student(Name, section, age, percentage);
		obj5.display();
		Name = s.next();
		section = s.next();
		age = s.nextInt();
		percentage = s.nextDouble();
		Student obj6 = new Student(Name, section, age, percentage);
		obj1.display();
		avg = (obj1.percentage + obj2.percentage + obj3.percentage + obj4.percentage + obj5.percentage
				+ obj6.percentage) / 6;
		System.out.println("Average percentage is: " + avg);
	}
}

class Student {
	String Name, section;
	int age;
	double percentage;

	Student(String Name, String section, int age, double percentage) {
		this.Name = Name;
		this.section = section;
		this.age = age;
		this.percentage = percentage;
	}

	public void display() {
		System.out.println("Name: " + Name);
		System.out.println("Section: " + section);
		System.out.println("Age: " + age);
		System.out.println("Percentage: " + percentage);
	}
}

package assignment_1;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("Total no. of objects called: ");
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		obj1.print();
		obj2.print();
		obj3.print();
		obj3.print();
		System.out.println("Total no of member function called: ");
		obj3.print();
	}
}

class A {
	int count = 0, count1 = 0;

	public void print() {
		count++;
		System.out.println(count);
	}

	A() {
		count1++;
		System.out.println(count1);
	}
}

package assignment_1;

public class Q7 {

	public static void main(String[] args) {
		System.out.println("Total no. of objects called: ");
		B obj1 = new B();
		B obj2 = new B();
		B obj3 = new B();
		obj1.print();
		obj2.print();
		obj3.print();
		obj3.print();
		System.out.println("Total no of member function called: ");
		obj3.print();
	}

}

class B {
	int count = 0, count1 = 0;

	public void print() {
		count++;
		System.out.println(count);
	}

	B() {
		count1++;
		System.out.println(count1);
	}
}

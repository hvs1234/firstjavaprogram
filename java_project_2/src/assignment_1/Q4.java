package assignment_1;

public class Q4 {

	public static void main(String[] args) {
		three obj = new three();
		three obj1 = new three(3, 4, 1);

	}

}

class one {
	one(int a, int b) {
		System.out.println("First Constructor ... " + a + b);
	}
}

class two extends one {
	two() {
		super(3, 4);
		System.out.println("Second Constructor ... ");
	}
}

class three extends two {
	three() {
		super();
		System.out.println("Third Constructor ... ");
	}

	three(int x, int y, int z) {
		System.out.println(x + y * z);
	}
}

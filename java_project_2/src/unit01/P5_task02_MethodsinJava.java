package unit01;
import java.util.Scanner;
public class P5_task02_MethodsinJava {

	public static void main(String[] args) {
        ABC3 obj = new ABC3();
		obj.display();
		System.out.println(obj.a);
	}
}
class ABC3 {
	
	static int a = 10;
	/* Actual Method definition
	 * 
	 * DataType methodName(DataType2 p1, DataType p2){
	 * 
	 *   methodBody;
	 *   return value; //if required
	 * 
	 * }
	 */
	
	static void display() {
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;
	}
}

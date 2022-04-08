package unit01;
import java.util.Scanner;
/*
 * The wrapper class in Java provides the mechanism to convert primitive into object and obj
 * Why ?
 * Because we want to use predefined methods of those objects
 * - boolean data types -> Boolean obj; -> obj.toString();
 *  
 * */

public class P4_task02_WrapperClassesinJava {

	public static void main(String[] args) {
		int a = 20;
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		// a.toString() can not be done due to a is integer not object
		
		//Auto boxing: Converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting Objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);

	}
}

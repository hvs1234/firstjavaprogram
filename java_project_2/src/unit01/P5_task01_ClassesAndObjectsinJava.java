package unit01;
import java.util.Scanner;
public class P5_task01_ClassesAndObjectsinJava {
      public static void main(String[] args)
      {
    	  ABC2 obj = new ABC2();
  		  obj.display2();
  		  ABC2.display();
      }
}
class ABC2{
	int a = 10;
	static int b = 10;
	
	static void display() {
		
		int b = 10;
		
		b++;
		
		//System.out.println(a);
		System.out.println(b);
	}
	
	void display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
	}
}

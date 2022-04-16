package unit02;
import static java.lang.System.*;
import static java.lang.Math.*;
import unit01.SampleClass;
public class P11_task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
          out.println("Welcome to package ...");
          out.println(sqrt(4));
          System.out.println(pow(2,2));
          System.out.println(abs(6.3));
          SampleClass obj = new SampleClass();
          System.out.println(obj.a);
	}
}

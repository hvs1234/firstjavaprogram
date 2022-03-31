package unit01;
import java.util.Scanner;
public class p3_task02_operatorsInJava {
    static void increment_decrement(int a, int b)
    {
    	int c,d,e,f;
    	c = a++;
    	d = b++;
    	e = c++;
    	f = d++;
    	System.out.println("Values are ..."+c+" "+d+" "+e+" "+f);
    }
    static void bitwise_operator(int a, int b)
    {
    	int x = a & b;
    	int y = a | b;
    	int z = a ^ b;
    	System.out.println("These values are ..."+x+" "+y+" "+z);
    }
    static void logical_operator(int a, int b)
    {
    	if(a==1 && b==1) System.out.println("Both values are 1 ...");
    	if(a==2 || b==4) System.out.println("Both values are different ...");
    }
	public static void main(String[] args) {
         int x,y;
         Scanner s = new Scanner(System.in);
         x = s.nextInt();  y = s.nextInt();
         increment_decrement(x,y);
         bitwise_operator(x,y);
         logical_operator(x,y);
	}
}

package unit03;
import java.util.*;
public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
         exception obj = new exception();
         obj.basicexception();
         obj.handleexception();
         obj.multiplecatch();
         obj.inputMismatchException();
         obj.StackOverflowException();
         obj.indexOutOfBoundException();
         obj.nullPointerException();
	}
}

class exception
{
	public void basicexception()
	{
		try {
			int a=4,b=0;
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Don't enter 0 ...");
		}
	}
	public void handleexception()
	{
		try {
			String s1,s2;
			s1 = "Hello"; s2 = "Horld";
			if(s1.charAt(0)==s2.charAt(0)) {
				throw new Exception("Try Again ...");
			}
			System.out.println(s1+" "+s2);
		}
		catch(Exception e)
		{
			System.out.println("Both First index of same element are not allowed ...");
		}
	}
	public void multiplecatch()
	{
        try {		
        	int[] arr = {1,2,3};
        	arr[3] = 34/0;
        	System.out.println(arr[10]);
        }
        catch(ArithmeticException A)
        {
        	System.out.println("Please don't enter 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Index out of range ...");
        }
	}
	public void inputMismatchException()
	{
	    try {	
			int a;
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			System.out.println(a);
	    }
	    catch(InputMismatchException e)
	    {
	    	System.out.println("Input Mismatch ...");
	    }
	}
	public void StackOverflowException()
	{
		try {
			int s=0;
			while(true) {
				s++;
				throw new Exception("Try...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Stack overflow ...");
		}
	}
	public void indexOutOfBoundException()
	{
         try {
     		int arr[] = {1,2,3};
    		System.out.println(arr[16]);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
         	System.out.println("Array Index out of range ...");
         }
	}
	public void nullPointerException()
	{
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Null Pointer Exception ...");
		}
	}
}

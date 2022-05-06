package assignment_1;

public class Q9 {
	static public int x = 10;
	public static void main(String[] args) {
         System.out.println(x);
         accessprotection obj = new accessprotection();
         obj.f(3,5);
         obj.print();
	}
}

class accessprotection
{
	private int a,b;
	protected int result;
	public void f(int x, int y)
	{
		a = x;
		b = y;
		result = x+y;
	}
	public void print()
	{
		System.out.println("Result is: "+result);
	}
}

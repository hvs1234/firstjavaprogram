package unit02;

public class P08_task01_InheritanceInJava {

	public static void main(String[] args) {
         Three g = new Three();
         g.methodOne();
         g.methodTwo();
         g.methodOne();
         g.methodThree();
         
         Two two = new Two(1);
         D obj = new D(2);
         obj.methodFour();
	}
}

class One
{
	int a;
	One(int x)
	{
		System.out.println("One Constructor ...");
	}
	public void methodOne()
	{
		System.out.println("First Method ...");
	}
}

class Two extends One
{
	int b;
	Two(int x)
	{
		super(3);
		b = x;
		System.out.println("Two Constructor ...");
	}
	public void methodTwo()
	{
		System.out.println("Second Method ...");
	}
}

class Three extends Two
{
	int c;
	Three()
	{
		super(1);
		System.out.println("Three Constructor ...");
	}
	Three(int x)
	{
		super(1);
		c = x;
		System.out.println("Three ...");
	}
	public void methodThree()
	{
		System.out.println("Third Method");
	}
}

class A
{
	int a;
	A(int a1)
	{
		a = a1;
	}
	public void methodFour()
	{
	    System.out.println(a);
	}
}

class B extends A
{
	int b;
	B(int b1)
	{
		super(10);
		b = b1;
	}
	public void methodFour()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	C()
	{
		super(10);
		c = 10;
	}
	public void methodThree()
	{
		System.out.println(c);
	}
}

class D extends A
{
	int d;
	D(int d1)
	{
	    super(d1);
	    d = d1;
	}
	public void methodFour()
	{
		System.out.println(d);
	}
}

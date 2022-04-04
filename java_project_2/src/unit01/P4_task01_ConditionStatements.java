package unit01;

public class P4_task01_ConditionStatements {
	static void DesicionMakingStatements()
	{
		int x = 1,y = 2;
		if(x+y<10) System.out.println("x+y is less than 10 ...");
		else System.out.println("x+y is greater than 20 ...");
		int num = 2;
		switch(num)
		{
		case 0: {
			System.out.println("num is 0 ...");  break;
		}
		case 1:{
			System.out.println("num is 1 ...");  break;
		}
		case 2:{
			System.out.println("num is 2 ...");  break;
		}
		default:{
			System.out.println(num);
		}
		}
 	}
	static void LoopStatements()
	{
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("First value of first natural numbers is: "+sum);
		String[] names = {"C++","Java","Python","C"};
		for(String name: names)
		{
			System.out.println(name);
		}
		int i=0;
		System.out.println("Print first 10 even numbers ...");
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		i=0;
		System.out.println("Print first 10 even numbers ...");
		do {
			System.out.println(i);
			i+=2;
		} while(i<=10);
	}
	static void JumpStatements()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==6) break;
			System.out.println(i);
		}
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==6) continue;
			System.out.println(i);
		}
	}
    public static void main(String[] args)
    {
    	DesicionMakingStatements();
    	LoopStatements();
    	JumpStatements();
    }
}

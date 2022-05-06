package assignment_1;
import java.util.*;
public class Q10 {
	public static void main(String[] args) {
		int n;
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
        sold[] arr = new sold[100];
        for(int i=0;i<n;i++)
        {
        	arr[i].setdata1();
        	for(int j=0;j<n;j++)
        	{
        		arr[i].setdata2();
        	}
        }
        for(int i=0;i<n;i++)
        {
        	arr[i].print1();
        	for(int j=0;j<n;j++)
        	{
        		arr[i].print2();
        	}
        }
	}

}
class sold
{
	String city;
	String Model;
	int p;
	Scanner s = new Scanner(System.in);
	public void setdata1()
	{
		System.out.println("Enter the city Name: ");
		city = s.next();
	}
	public void setdata2()
	{
		System.out.println("Enter the Model Name: ");
		Model = s.next();
		System.out.println("How many cars sold: ");
		p = s.nextInt();
	}
	public void print1()
	{
		System.out.println("City Name: "+city);
	}
	public void print2()
	{
		System.out.println("Model Name: "+Model);
	}
}

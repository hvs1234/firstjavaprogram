import java.util.*;
public class P16_MultiThreading_In_Java
{
    public static void main(String[] args)
    {
        Thread T1 = new Thread(new T1() , "T1");
        Thread T2 = new Thread(new T2() , "T2");
        Thread T3 = new Thread(new T3() , "T3");
        T1.start();
        T2.start();
        T3.start();
    } 
}

class T1 extends Thread
{
    public void run()
    {
        int r;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        r = s.nextInt();
        System.out.print("Square of "+r+" no is: "+r*r);
    }
}

class T2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hey ...");
        }
    }
}

class T3 extends Thread
{
    public void run()
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term of pattern: ");
        n = s.nextInt();
        int c = 2*n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i+j==n-1 || j-i==n-1 || i==n-1)
                {
                    System.out.print(" *");
                }
                else System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}


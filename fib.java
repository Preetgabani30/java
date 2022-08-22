import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		int a=0,b=1,c,n;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the number to print fib:");
		n=aa.nextInt();
		System.out.println(" "+a);
		System.out.println(" "+b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}
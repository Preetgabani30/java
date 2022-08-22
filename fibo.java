import java.util.Scanner;
class fibo
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,n,i;
		Scanner ff=new Scanner(System.in);
		n=ff.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=n;i++)
		{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
	}
}

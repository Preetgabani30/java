import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
		int a,b,c,max;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter three number");
		a=aa.nextInt();
		b=aa.nextInt();
		c=aa.nextInt();
		max=(a>b?((a>c)?a:c):((b>c)?b:c));
		System.out.println(max+" is Max");
	}
}
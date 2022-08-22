import java.util.Scanner;
class Pal
{
	public static void main(String args[])
	{
		int r=0,rem,num;
		int n;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the number::->");
		n=aa.nextInt();
		num=n;
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number="+r);
		if(r==num)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
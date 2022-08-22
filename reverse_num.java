import java.util.Scanner;
class reverse_num
{
	public static void main(String args[])
	{
		int r=0,rem;
		int n;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the number::->");
		n=aa.nextInt();
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number="+r);
	}
}
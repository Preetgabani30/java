import java.util.Scanner;
class Prime
{	
	public static void main(String args[])
	{
		int i,j,n,count;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the number");
		n=aa.nextInt();
		for(i=1;i<=n;i++)
		{	
			count=0;		
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
			         count++;
		
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		
	}
}
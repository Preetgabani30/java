import java.util.Scanner;
public class TwoMat
{  
	public static void main(String args[])
	{  
		int i,j,k;    
		int a[][]=new int[3][3];   
		int b[][]=new int[3][3]; 
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the Elements in First Matrix:->");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=aa.nextInt();
			}
		}
		System.out.println("Enter the Elements in Second Matrix:->");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=aa.nextInt();
			}
		}    
		int c[][]=new int[3][3];     
		for(i=0;i<3;i++)
		{    
			for(j=0;j<3;j++)
			{    
				c[i][j]=0;      
				for(k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}  
				System.out.print(c[i][j]+" ");  
			}
			System.out.println();   
		}    
	}
}
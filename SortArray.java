import java.util.Arrays;
import java.util.Scanner;   
public class SortArray  
{   
	public static void main(String[] args)   
	{    
		int i;
		int [] array = new int [5];   
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the 5 elements in array:->");  
		for(i=0;i<5;i++)
		{
			array[i]=aa.nextInt();
		}
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		for (i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}   
	}  
}
import java.util.Scanner;
class Wrapper_class
{
	public static void main(String args[])
	{
		int a;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the value of a::->");
		a=aa.nextInt();
		Integer obInt=new Integer(a);
		System.out.println("After wrapping Primitive data type:"+obInt);
		
	}
}
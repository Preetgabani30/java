import java.util.Scanner;
class fact{  
 public static void main(String args[])
 {  
	int i,fact=1;  
	Scanner aa=new Scanner(System.in);
	int number=5;//It is the number to calculate factorial    
	System.out.println("Enter number:->");
	number=aa.nextInt();
	for(i=1;i<=number;i++)
	{    
		fact=fact*i;    
	}    
	System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
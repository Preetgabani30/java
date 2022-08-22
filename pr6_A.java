class pr6_A
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
	}
} 
class Adder
{  
	static int add(int a, int b){return a+b;}  
	static double add(double a, double b){return a+b;}  
}  

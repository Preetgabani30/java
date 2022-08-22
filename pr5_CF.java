class my_number 
{
	public int number;
	public void my_number()
	{
		number = 1;
	}
}
class pr5_CF
{
	public static void main (String arguments[])
	{
		my_number object = new my_number();
		System.out.println("number = " + object.number);
		update(object);
		System.out.println("number = " + object.number);
	} 
	public static void update( my_number object )
	{ 
		object.number++;  
    }
}
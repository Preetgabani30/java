class pr5_CT
{
	public static void main (String [] arguments)
	{
		int number[] = { 1 };
		System.out.println("number = " + number[0]);
		update(number);
		System.out.println("number = " + number[0]);
	} 
    public static void update( int number[] )
	{      
		number[0]++;
    }
}
class String_Args
{
	public static void main(String args[])
	{
		String a=new String(args[0]);
		String b=new String(args[1]);
		/*if(a==b)
		{
			System.out.println("String one is equal to String two");
		}
		else
		{
			System.out.println("String one is not equal to String two");
		}*/
		System.out.println(a);
		System.out.println(b);
		
		boolean r =a.equals(b);
		System.out.println(r);
	}
}
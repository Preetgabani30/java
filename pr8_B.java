class A
{
	static int x;
}
class B extends A
{
	int x;
	void b(int a,int b)
	{
		super.x=a;
		x=b;
	}
	void display()
	{
		System.out.println("The Value of X in class A is "+super.x);
		System.out.println("The Value of X in class B is "+x);
	}
}
class pr8_B
{
	public static void main(String args[])
	{
		B bb=new B();
		bb.b(10,20);
		bb.display();
	}
}

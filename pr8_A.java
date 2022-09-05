class A
{
	void a()
	{
		System.out.println("This is from Class A");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("This is from Class B");
	}
}
class C extends B
{
	void c()
	{
		System.out.println("This is from Class C");
	}
}
class D extends A
{
	void d()
	{
		System.out.println("This is from Class D");
	}
}
class pr8_A
{
	public static void main(String args[])
	{
		D dd=new D();
		dd.d();
		C cc=new C();
		cc.a();
	}
}
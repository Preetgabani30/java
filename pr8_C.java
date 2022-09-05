interface A
{
	public abstract void a();
}
interface B
{
	public abstract void b();
}
class C implements A,B
{
	public void a()
	{
		System.out.println("This is from class A");
	}
	public void b()
	{
		System.out.println("This is from class B");
	}
}
class pr8_C
{
	public static void main(String args[])
	{
		C cc=new C();
		cc.a();
		cc.b();
	}
}
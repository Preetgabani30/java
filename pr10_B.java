class A
{
    protected int a=200;
    protected int b=100;
}
final class B extends A
{
    B()
    {
        System.out.println("The Final Class");
        System.out.println("The Final Class not Inherited");
        System.out.println("Final class of inherited classes");
    }
    void add()
    {
        int c=a+b;
        System.out.println("Addition : "+c);
    }
}
class pr10_B
{
    public static void main(String arg[])
    {
        B f=new B();
        f.add();
    }
}
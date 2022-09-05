abstract class Shape
{
    float di1,di2,r;
    abstract float area();
}
class T extends Shape
{
    T(float d1, float d2)
    {
        di1=d1;
        di2=d2;
    }
    float area()
    {
        System.out.println("Area of Triangle is ");
        return (di1*di2)/2;
    }
}
class R extends Shape
{
    R(float d1, float d2)
    {
        di1=d1;
        di2=d2;
    }
    float area()
    {
        System.out.println("Area of Rectangle is ");
        return di1*di2;
    }
}
class C extends Shape
{
    C(float d1)
    {
        r=d1;
    }
    float area()
    {
        System.out.println("Area of Circle is ");
        return 3.14f*r*r;
    }
}
class pr10_A
{
    public static void main(String arg[])
    {
        T t=new T(4.3f,5.3f);
        R r=new R(2.4f,4.2f);
        C c=new C(10.5f);

        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());

    }
}
import java.util.Scanner;
class Area
{
	public void Triangle(float a,float b)
	{
		float r;
		r=0.5f*a*b;
		System.out.println("Area of Triangle is "+r);
	}
	public void Circle(float t)
	{
		float a;
		final float pi=3.14f;
		a=pi*t*t;
		System.out.println("Area of Circle is "+a);
	}
	public static void main(String args[])
	{
		float b,h,r;
		Scanner aa=new Scanner(System.in);
		Area a=new Area();
		System.out.println("Enter the base of triangle::->");
		b=aa.nextFloat();
		System.out.println("Enter the height of triangle::->");
		h=aa.nextFloat();
		a.Triangle(b,h);
		System.out.println("Enter the radius of circle ");
		r=aa.nextFloat();
		a.Circle(r);
	}
}
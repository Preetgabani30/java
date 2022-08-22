class Box
{
	double width,height,depth;
	Box()
	{
		width=2.5;
		height=2.5;
		depth=2.5;
		double volume=width*height*depth;
		System.out.println("Volume of Box is "+volume);
	}
	Box(double width)
	{
		this.width=width;
		height=2.5;
		depth=2.5;
		double volume=width*height*depth;
		System.out.println("Volume of Box is "+volume);
	}
}
class pr6_B
{
	public static void main(String args[])
	{
		Box aa=new Box();
		Box bb=new Box(2.5);
	}
}
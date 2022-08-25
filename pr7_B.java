class TestPrivate 
{
	private int age;
	public int setAge(int age) 
	{
		this.age = age;
		return age;
	}
}
class pr7_B
{
	public static void main(String[] args) 
	{
	TestPrivate test = new TestPrivate();
	//test.setAge(25);
	System.out.println("Age: " + test.setAge((int)25));
	//System.out.println("Name: " + test.getName());
	}
}

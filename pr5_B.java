import java.util.Scanner;
class Student
{
	int enroll,sub1,sub2,sub3;
	String name;
	public void insert()
	{
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the Enrollement number:->");
		enroll=aa.nextInt();
		System.out.println("Enter the Name:->");
		name=aa.next();
		System.out.println("Enter the marks of sub1:->");
		sub1=aa.nextInt();
		System.out.println("Enter the marks of sub2:->");
		sub2=aa.nextInt();
		System.out.println("Enter the marks of sub3:->");
		sub3=aa.nextInt();
	}
	public void disp()
	{
		int sum;
		System.out.println("Enrollement number:->"+enroll);
		System.out.println("Name:->"+name);
		System.out.println("Marks of subject 1:->"+sub1);
		System.out.println("Marks of subkect 2:->"+sub2);
		System.out.println("Marks of subkect 3:->"+sub3);
		sum=sub1+sub2+sub3;
		System.out.println("Total Marks of student:->"+sum);
	}
}
class pr5_B
{
	public static void main(String args[])
	{
		Student a=new Student();
		a.insert();
		a.disp();
	}
}
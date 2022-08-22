class com
{
	public static void main(String args[])
	{
		int sum;
		float avg;
		Integer A=new Integer(args[0]);
		Integer B=new Integer(args[1]);
		Integer C=new Integer(args[2]);
		Integer D=new Integer(args[3]);
		Integer E=new Integer(args[4]);
		sum=A+B+C+D+E;
		avg=sum/5;
		System.out.println("sum of five number:-"+sum);
		System.out.println("avg of five number:-"+avg);
	}
}
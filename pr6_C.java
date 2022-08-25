public class pr6_C {
    int a,b;
    static int count;
    private pr6_C()      
    {

        count++;
        System.out.println("I'm Default Constructor "+count);
    }
    private pr6_C(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    int getNumFirst()
    {
        return a;
    }
    int getNumSecond()
    {
        return b;
    }

    public static void main(String arg[])
    {


		pr6_C p1=new pr6_C();
        pr6_C p2=new pr6_C();
        pr6_C p3=new pr6_C();
        pr6_C p4=new pr6_C();
        System.out.println("Instances of Default Constructor : "+count);

        pr6_C p5=new pr6_C(count,5);
        int x=p5.getNumFirst();
        int y=p5.getNumSecond();
        int minOutOfTwo=x<y?x:y;
        System.out.println("Minimum of "+x+" and "+y+" is "+minOutOfTwo);
    }
}
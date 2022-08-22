public class pr5_c
{
    int a = 10;
    void call(pr5_c eg)
	{
        eg.a = eg.a+10;
    }
     
    public static void main(String[] args) {
 
        pr5_c eg = new pr5_c();
        System.out.println("Before call-by-reference: " + eg.a);
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);
         
         
    }
}
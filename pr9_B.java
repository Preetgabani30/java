interface A
{
    int I = 1;
    void showI();
}
interface B
{
    int J = 2;
    void showJ();
}
interface C extends A, B
{
    int K = 3;
    void showK();
}
class D implements C
{
    public void showI()
    {
        System.out.println("I : " + I);
    }

    public void showJ()
    {
        System.out.println("J : " + J);
    }
    public void showK()
    {
        System.out.println("K : " + K);
    }
}+++
public class pr9_B
{
    public static void main(String[] args)
    {
        D obj = new D();
        obj.showI();
        obj.showJ();
        obj.showK();
    }
}
interface TestInterface
{
}
public class mark implements TestInterface 
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
 
    public static void main(String args[])
    {
        mark d = new mark();
        d.square(4);
    }
}
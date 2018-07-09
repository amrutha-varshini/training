interface TestInterface
{
    // abstract method
    public void square(int a);
 
    // default method
    default void show()
    {
      System.out.println("Default Method interface Executed");
    }
}
class TestClass
{
	// default method
    void show()
    {
      System.out.println("Default Method class Executed");
    }
}
public class inter /*extends TestClass //compile time error*/ implements TestInterface 
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
 
    public static void main(String args[])
    {
        inter d = new inter();
        d.square(4);
 
        // default method executed
        d.show();
    }
}
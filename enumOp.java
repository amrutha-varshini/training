enum Color
{
    APPLE(), BANANA(), GRAPES();
}
 
public class enumOp
{
    public static void main(String[] args)
    {
        Color c=Color.APPLE;
        Color arr[] = Color.values();
        for (Color col : arr)
        {
			System.out.println(col.hashCode() + " at index "+ col.ordinal());
        }
        System.out.println(Color.valueOf("APPLE"));
    }
}
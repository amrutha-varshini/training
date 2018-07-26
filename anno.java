import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
class anno
{
	@Retention (RetentionPolicy.RUNTIME)
	@interface myanno
	{
		String name();
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("Unchecked")
		int a;
	}
}
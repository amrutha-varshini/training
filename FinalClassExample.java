public final class FinalClassExample 
{
	private final int id;
	private final String name;
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public FinalClassExample(int i, String n)
	{
		System.out.println("Performing Deep  for Object initialization");
		this.id=i;
		this.name=n;
	}
	public static void main(String[] args) 
	{
		String s = "original";
		int i=10;
		FinalClassExample ce = new FinalClassExample(i,s);
		//Lets see whether its copy by field or reference
		System.out.println(s==ce.getName());
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		//change the local variable values
		i=20;
		s="modified";
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
	}

}

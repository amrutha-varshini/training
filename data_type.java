//example for all primitive data types, type conversion, type promotion and type casting

public class data_type
{
	public static void main(String[] args)
	{
		byte b;//8 bits
		int i;//32 bits
		short s;//16 bits
		long l;//64 bits
		float f;//32 bits
		double d;//64 bits
		char c;//8 bits
		boolean bb;//1 bit
		
		/*System.out.println(b);//can't print undefined variables.CTE
		System.out.println(i);//can't print undefined variables.CTE
		System.out.println(s);//can't print undefined variables.CTE
		System.out.println(l);//can't print undefined variables.CTE
		System.out.println(f);//can't print undefined variables.CTE
		System.out.println(d);//can't print undefined variables.CTE
		System.out.println(c);//can't print undefined variables.CTE
		System.out.println(bb);//can't print undefined variables.CTE
		
		b=null;
		i=null;
		s=null;
		l=null;
		f=null;
		d=null;
		c=null;
		bb=null;
		
		System.out.println(b);//can't assign null to primitive variables.CTE
		System.out.println(i);//can't assign null to primitive variables.CTE
		System.out.println(s);//can't assign null to primitive variables.CTE
		System.out.println(l);//can't assign null to primitive variables.CTE
		System.out.println(f);//can't assign null to primitive variables.CTE
		System.out.println(d);//can't assign null to primitive variables.CTE
		System.out.println(c);//can't assign null to primitive variables.CTE
		System.out.println(bb);//can't assign null to primitive variables.CTE*/
		
		b=127;//assigning byte value
		System.out.println(b);//prints as it is
		/*b=256;//assigning short, int, long 
		System.out.println(b);//incompatible types
		b=50.63;//assigning float, double
		System.out.println(b);//incompatible types
		b=true;//assigning boolean
		System.out.println(b);//incompatible types*/
		b='a';//assigning a character
		System.out.println(b);//prints ASCII value
		
		s=b;//assigning byte value
		System.out.println(s);//automatic type convertion
		s=256;//assigning short value
		System.out.println(s);//prints as it is
		/*s=32778;//assigning int, long 
		System.out.println(s);//incompatible types
		s=50.63;//assigning float, double
		System.out.println(s);//incompatible types
		s=true;//assigning boolean
		System.out.println(s);//incompatible types*/
		s='a';//assigning a character
		System.out.println(s);//prints ASCII value
		
		i=b;//assigning byte value
		System.out.println(i);//automatic type convertion
		i=s;//assigning short value
		System.out.println(i);//automatic type convertion
		i=32769;//assigning int
		System.out.println(i);//prints as it is
		/*i=2147483648;//assigning long 
		System.out.println(i);//incompatible types
		i=50.63;//assigning float, double
		System.out.println(i);//incompatible types
		i=true;//assigning boolean
		System.out.println(i);//incompatible types*/
		i='a';//assigning a character
		System.out.println(i);//prints ASCII value
		
		l=b;//assigning byte value
		System.out.println(l);//automatic type convertion
		l=s;//assigning short value
		System.out.println(l);//automatic type convertion
		l=i;//assigning int value
		System.out.println(l);//automatic type convertion
		l=2147483648l;//assigning long 
		System.out.println(l);//prints as it is
		/*l=50.63;//assigning float, double
		System.out.println(l);//incompatible types
		l=true;//assigning boolean
		System.out.println(l);//incompatible types*/
		l='a';//assigning a character
		System.out.println(l);//prints ASCII value
		
		f=b;//assigning byte value
		System.out.println(f);//automatic type convertion
		f=s;//assigning short value
		System.out.println(f);//automatic type convertion
		f=i;//assigning int value
		System.out.println(f);//automatic type convertion
		f=l;//assigning long 
		System.out.println(f);//automatic type convertion
		f=50.63f;//assigning float 
		System.out.println(f);//prints as it is
		/*f=50.63;//assigning double
		System.out.println(f);//incompatible types
		f=true;//assigning boolean
		System.out.println(f);//incompatible types*/
		f='a';//assigning a character
		System.out.println(f);//prints ASCII value
		
		d=b;//assigning byte value
		System.out.println(d);//automatic type convertion
		d=s;//assigning short value
		System.out.println(d);//automatic type convertion
		d=i;//assigning int value
		System.out.println(d);//automatic type convertion
		d=l;//assigning long 
		System.out.println(d);//automatic type convertion
		d=50.63f;//assigning float 
		System.out.println(d);//automatic type convertion
		d=50.63;//assigning double
		System.out.println(d);//prints as it is
		/*d=true;//assigning boolean
		System.out.println(d);//incompatible types*/
		d='a';//assigning a character
		System.out.println(d);//prints ASCII value
		
		/*c=b;//assigning byte, short, int, long value
		System.out.println(c);//incompatible types
		c=true;//assigning boolean
		System.out.println(c);//incompatible types*/
		c='a';//assigning a character
		System.out.println(c);//prints as it is
		
		/*bb=127;//assigning byte, short, int, long value
		System.out.println(bb);//prints as it is
		bb=50.63;//assigning float, double
		System.out.println(bb);//incompatible types*/
		bb=true;//assigning boolean
		System.out.println(bb);//incompatible types
		/*bb='a';//assigning a character
		System.out.println(bb);//prints ASCII value*/
		
		b=(byte)2147483;
		System.out.println(b);
		s=(short)2147483;
		System.out.println(s);
		i=(int)2147483;
		System.out.println(i);
		l=(long)2147483;
		System.out.println(l);
		f=(float)2147483;
		System.out.println(f);
		d=(double)2147483;
		System.out.println(d);
		c=(char)2147483;
		System.out.println(c);
		/*bb=(boolean)2147483;
		System.out.println(bb);//incompatible type*/
		
		d=b+i*s/f%l;//all types are promoted to double since the destination operand is double
		System.out.println(d);
	}
}
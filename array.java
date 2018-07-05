public class array
{
	public static void main(String[] args)
	{
		//1D array
		int[] a,c,b={1,2,3};
		a=new int[5];
		for(int i=0;i<5;i++)
			a[i]=i;
		c=new int[]{1,2};
		for(int x:a)
			System.out.println(x);
		for(int x:b)
			System.out.println(x);
		for(int x:c)
			System.out.println(x);
		//2D array
		int[][] d;
		d=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				d[i][i]=i+j;
		for(int[] x:d)
			for(int y:x)
				System.out.println(y);
		//ragged array
		int[][] e;
		e=new int[3][];
		e[0]=new int[1];
		e[1]=new int[2];
		e[2]=new int[3];
		e[0][0]=5;
		e[1][0]=4;
		e[1][1]=3;
		e[2][0]=2;
		e[2][1]=1;
		e[2][2]=0;
		for(int[] x:e)
			for(int y:x)
				System.out.println(y);
	}
}
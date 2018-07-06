public class keyword
{
	public static void main(String[] args)
	{
		int[][] a= new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=i+j;
		//break using label
		nextloop:for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(a[i][j]==3)
					break nextloop;
				else
					System.out.println(a[i][j]+","+i+","+j);
		//continue using label
		nextloop:for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(a[i][j]==3)
					continue nextloop;
				else
					System.out.println(a[i][j]+","+i+","+j);
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(a[i][j]==3)
					continue;
				else
					System.out.println(a[i][j]+","+i+","+j);
	}
}
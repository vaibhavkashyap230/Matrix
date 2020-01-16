public class Solution
{
	// input - input 2D array
	public static void wavePrint(int a[][])
    {
		int f=1,m=a.length,n=a[0].length;
		for(int i=0;i<n;i++)
		{
			if(f==1)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(a[j][i]);
					System.out.print(' ');
				}
				f=0;
			}
			else
			{
				for(int j=m-1;j>=0;j--)
				{
					System.out.print(a[j][i]);
					System.out.print(' ');
				}
				f=1;
			}
		}
		System.out.println();
	}	
}

public class Solution
{

	public static void rotate(int o[][])
    {
        int n=o.length;
        int a[][]=new int[n][n];
        
        int c=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=o[j][c];
            }
            c-=1;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                o[i][j]=a[i][j];
            }
        }
	}
}

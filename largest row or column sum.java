public class Solution
{	
	public static void findLargest(int a[][])
    {
        String str="";
        int max=Integer.MIN_VALUE,m=a.length,n=a[0].length,r=0;
        
        for(int i=0;i<m;i++)
        {
            int s=0;
            for(int j=0;j<n;j++)
            {
                s+=a[i][j];
            }
            if(s>max)
            {
                max=s;
                str="row";
                r=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=0;j<m;j++)
            {
                s+=a[j][i];
            }
            if(s>max)
            {
                max=s;
                str="column";
                r=i;
            }
        }
        System.out.print(str);
        System.out.print(' ');
        System.out.print(r);
        System.out.print(' ');
        System.out.print(max);
	}
}

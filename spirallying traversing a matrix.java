public class solution
{
	public static void spiralPrint(int a[][])
    {
        int m=a.length,n=a[0].length;
		int t=0,b=m-1,l=0,r=n-1;
		int d=1;
		while(t<=b && l<=r)
		{
			if(d==1)		//right
			{
				for(int i=l;i<=r;i++)
				{
					System.out.print(a[t][i]);
					System.out.print(' ');
				}
				t+=1;
				d=2;
				continue;
			}
			if(d==2)		//down
			{
				for(int i=t;i<=b;i++)
				{
					System.out.print(a[i][r]);
					System.out.print(' ');
				}
				r-=1;
				d=3;
				continue;
			}
			if(d==3)		//left
			{
				for(int i=r;i>=l;i--)
				{
					System.out.print(a[b][i]);
					System.out.print(' ');
				}
				b-=1;
				d=4;
				continue;
			}
			else		//up
			{
				for(int i=b;i>=t;i--)
				{
					System.out.print(a[i][l]);
					System.out.print(' ');
				}
				l+=1;
				d=1;
			}
		}
		System.out.println();
	}
}

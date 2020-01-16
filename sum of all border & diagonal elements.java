import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[][]=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		
		int t=0;
		for(int i=1;i<n-1;i++)
		{
			t+=a[0][i];
			t+=a[n-1][i];
			t+=a[i][0];
			t+=a[i][n-1];
		}
		for(int i=0,j=0;i<n;i++,j++)
		{
			t+=a[i][j];
		}
		for(int i=0,j=n-1;i<n;i++,j--)
		{
			t+=a[i][j];
		}
		if(n%2==1)
		{t-=a[n/2][n/2];}
		System.out.println(t);
	}
}

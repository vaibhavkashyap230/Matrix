import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int m,n;
        m=s.nextInt();
        n=s.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                c+=a[i][j];
            }
            System.out.print(c);
            System.out.print(' ');
        }
        System.out.println();
	}
}

// https://classroom.codingninjas.com/app/classroom/me/1108/content/27633/offering/285988/problem/365

import java.util.Arrays;
public class solution
{
	public static int maximumProfit(int a[])
    {
        Arrays.sort(a);
        int r=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            r=Math.max((a.length-i)*a[i],r);
        }
        return r;
	}
}

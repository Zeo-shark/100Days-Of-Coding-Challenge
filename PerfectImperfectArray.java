package codeforces;
import java.util.*;

public class PerfectImperfectArray {
	
	public static void main(String args[])
	{
		//a^2* b^2* c^2== (a*b*c)^2;
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			int arr[]= new int[n];
			int f=0;
			for(int i=0;i<n;i++)
			{
				arr[i]= sc.nextInt();
				
				
			}
			for(int i=0;i<n;i++)
			{
				if(arr[i]>0)
				{
					double sqrt= Math.sqrt(arr[i]);
					
					if((double)arr[i] != sqrt*sqrt)
					{
						f=1;
						break;
					}
				}
				
			}
			if(f==1)
			{
			System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}

package codeforces;

import java.util.*;
public class SpyDetected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			int ar[]= new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]= sc.nextInt();
			}
			
			for(int i=0;i<n-2;i++)
			{
				if(ar[i]!=ar[i+1] && ar[i+1]==ar[i+2])
				{
					System.out.println(i+1);
					break;
				}
				else if(ar[i]==ar[i+1] && ar[i+1]!=ar[i+2])
				{
					System.out.println(i+3);
					break;
				}
				else if(ar[i]!=ar[i+1] && ar[i+1]!=ar[i+2])
				{
					System.out.println(i+2);
					break;
				}
				else
				{
					continue;
				}
			}
		}
	}

}

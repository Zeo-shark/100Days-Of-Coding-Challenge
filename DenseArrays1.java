package codeforces;

import java.util.*;
public class DenseArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			float x,z,m;
			int a[]= new int[n];
			int l=0;
			for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				int j=i+1;
				if(j<n)
				{
					x= Math.max(a[i], a[i+1]);
					m= Math.min(a[i], a[i+1]);
					z= x/m;
					while(z>2)
					{
						m=m*2;
						z= x/m;
						l++;
					}
				}
			}
			System.out.println(l);
		}
	}
	
	

}

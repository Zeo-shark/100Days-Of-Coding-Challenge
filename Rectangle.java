package codeforces;

import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			List<String> ar= new ArrayList<String>();
			int flag=0;
			int r1=0,c1=0,r2=0,c2=0;
			for(int i=0;i<n;i++)
			{
					ar.set(i, sc.next());
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(ar.get(i).charAt(j)=='*' && flag==0)
					{
						r1= i;
						c1= j;
						flag=1;
					}
					
					else if(ar.get(i).charAt(j)=='*' && flag==1)
					{
						r2=i;
						c2=j;
					}
				}
			}
			
			if(r1==r2 && c1!=c2)
			{
				ar[r1+1][c1]='*';
				ar[r1+1][c2]='*';
			}
			else if(r1!=r2 && c1==c2)
			{
				ar[r1][c1+1]='*';
				ar[r2][c1+1]='*';
			}
			else if(r1!=r2 && c1!=c2)
			{
				ar.get(r1)[c2]='*';
				ar.get(r2)[c2]='*';
			}
			
			
			for(int i=0;i<n;i++)
			{
					System.out.print(ar.get(i));
				System.out.println();
			}
		}

	}

}

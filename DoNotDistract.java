package codeforces;

import java.util.*;
public class DoNotDistract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			int f=0;
			String s= sc.next();
			List<Character> c= new ArrayList<Character>();
			for(int i=0;i<n-1;i++)
			{
				char ch= s.charAt(i);
				char ch_1= s.charAt(i+1);
				
				if(c.contains(ch))
				{
					f=1;
					break;
				}
				if(ch== ch_1)
				{
					continue;
				}
				else {
					c.add(ch);
				}
				
			}
			if(c.contains(s.charAt(n-1)))
			{
				f=1;
			}
			if(f==0)
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

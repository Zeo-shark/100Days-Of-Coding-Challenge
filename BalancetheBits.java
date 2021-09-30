package codeforces;
import java.util.*;
import java.lang.*;
public class BalancetheBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			String s1= sc.next();
			char[] s= s1.toCharArray();
			if( (n&1)==0 || s[n-1]=='0' || s[0]=='0' ) {
			System.out.println("NO");
			continue;
			}
			
			int co = 0, cz=0;
			for(int i=0;i<n;i++)
			{
				if(s[i]=='0')
					cz++;
				else if(s[i]=='1')
					co++;
				
			}
			if(co%2== 1 || cz%2==1)
			{
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
			
			String a="", b="";
			int c1=1, c2=0;
			for(int i=0;i<n;i++)
			{
				if(s[i]=='1')// s[i]==1
					// c1 <= c0/2
				{
					//checking if we have traversed half of the ones or not and we need to start with 1 itself
					if(c1 <= co/2)
					{
						a+="(";
						b+="(";						
					}
					else {
						a+=")";
						b+=")";
					}
					++c1;
				}
				else
				{
					if(c2 == 0)
					{
						a+="(";//opening brackets
						b+=")";
					}
					else
					{
						a+=")";
						b+="(";
					}
					c2^= 1;
					
				}
			}
			System.out.println(a+"\n"+b);
			
			
		}
	}

}

package codeforces;
import java.util.*;
import java.lang.*;
public class PalindromeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int n= sc.nextInt();
			String s1= sc.next();
			char[] s= s1.toCharArray();
			
			int count= 1, Alice= 1, Bob=0;
			for(int i=0;i<n;i++)
			{
				if(s[i]=='0')
				{
					s[i]='1';
				}
			}
			while(isAllOne(s, n)) {
			if(isPalindrome(s, n))
			{
				count++;
			}
			else {
				for(int i=0;i<n;i++)
				{
					if(s[i]=='0')
					{
						s[i]='1';
					}
				}
				if(count%2==0)
				{
					Bob++;
				}
				else {
					Alice++;
				}
				count++;
			}
			}
			if(Alice< Bob)
			{
				System.out.println("BOB");
			}
			else
			{
				System.out.println("ALICE");
			}
			
		}
	}
	
	static boolean isAllOne(char[] s, int n) {
		for(int i=0;i<n;i++)
		{
			if(s[i]=='0')
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean isPalindrome(char[] s, int n) {
		for(int i=0;i<n/2;i++)
		{
			if(s[i]== s[n-i-1])
			{
				return false;
			}
		}
		return true;
	}
        
}

package codeforces;

import java.util.*;
public class PotionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int k= sc.nextInt();
//			if(100%k==0)
//			{
//				System.out.println(100/k);
//			}
//			else
//			{
//				System.out.println("100");
//			}
			int a= k;
			int b= 100;
			int g= gcd(a, b);
			a= a/g;
			b= b/g;
			System.out.println(b);
		}
	}
		
		static int gcd(int a, int b)
		{
			if(a!=0)
			{
				return b;
			}
			while(a!=0)
			{
				int temp = b;
				b= a%b;
				a= temp;
			}
			return b;
		}
}



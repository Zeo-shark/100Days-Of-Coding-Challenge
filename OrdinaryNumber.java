package codeforces;

import java.util.*;
public class OrdinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			long n= sc.nextInt();
			long div= 1111111111;
			long count=0;
			if(n<10)
			{
				count=n;
			}
			else
			{
				count=9;
			}
				
			while(n<=div)
			{
				div=div/10;
			}
			while(n>10)
			{
				count=count+(n/div);
				n=n/10;
				div=div/10;
			}
			System.out.println(count);
		}
	}
}

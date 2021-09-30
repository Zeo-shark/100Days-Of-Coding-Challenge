package codeforces;

import java.util.*;
public class StrangeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			long n= sc.nextLong();
			long m= sc.nextLong();
			long x= sc.nextLong();
			long r= (x-1)%n;//Columns by
			long c= (x-1)/n;//Columns by
			
			long value = (r*m)+(c+1);//row by
			System.out.println(value);
		}
	}

}

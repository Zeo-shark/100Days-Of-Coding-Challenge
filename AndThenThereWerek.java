package codeforces;

import java.util.*;
public class AndThenThereWerek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int T= sc.nextInt();
		while(T-->0)
		{
			long n= sc.nextLong();
//			log2 N = log10 N / log10 2.
			double k= Math.log(n)/Math.log(2);
			int res= (int)Math.floor(k);
			System.out.println((int)Math.pow(2, res)-1);
		}
	}

}

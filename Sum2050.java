package codeforces;
import java.util.*;
import java.lang.*;
public class Sum2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		int count=0;
		while(T-->0)
		{
			long n= sc.nextInt();
			
			while(n < 2050)
			{
				int dig= ComputeDigit(n);
				long sub= 2050*(long)Math.pow(10, dig);
				n = n - sub;
				count++;
			}
			if(n == 0)
				System.out.println(count);
			else
				System.out.println("-1");
		}
	}
	//250505050050
	static int ComputeDigit(long n)
	{
		int count=0;
		while(n%10!=0)
		{
			n= n / 10;
			count++;
		}
		return count-4;
	}

}

package codeforces;

import java.util.*;
public class gcdlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			int x= (int)Math.pow(10,a-1);
			int y= (int)(Math.pow(10, b-1)+Math.pow(10, c-1));
			System.out.println(x+" "+y);
		}
	}

}

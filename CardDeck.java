package codeforces;

import java.util.*;
public class CardDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int q= sc.nextInt();
		List<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		while(q-->0)
		{
			int t= sc.nextInt();
			int pos= a.indexOf(t);
			a.remove(pos);
		    a.add(0, t);
		    System.out.print((pos+1)+" ");
		}
	}

}

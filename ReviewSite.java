package codeforces;

import java.util.Scanner;
public class ReviewSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		while(T-->0)
		{
			int vote, upvote=0, downvote=0;
			vote = sc.nextInt();
			for(int i=0;i<vote;i++)
			{
			int p= sc.nextInt();
			if(p==1)
			{
				upvote++;
			}
			else if(p==2)
			{
				downvote++;
			}
			else if(p==3){
//				if(upvote>downvote) {
//					upvote++;
//				}
//				else {
//					downvote++;
//				}
				upvote++;
			}
			}
			System.out.println(upvote);
		}
	}

}

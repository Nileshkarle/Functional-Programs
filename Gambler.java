package org.json.simple.parser;

import java.util.*;
class Gambler
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
				//collect values from user.
		System.out.println("Enter value of Stake.");
		int stake=scan.nextInt();
		System.out.println("Enter value of Goal.");
		int goal=scan.nextInt();
		System.out.println("How many times do you want to run the program ? ");
		int number=scan.nextInt(); 
		Random r=new Random();
		float random;
		int win=0,loss=0;
		int same_stake;
		float percent_of_win=0.00f,percent_of_loss=0.00f;

		for(int i=1;i<=number;i++) //number of times the loop must run.
		{
			same_stake=stake; //copy stake value.
			while(same_stake!=goal) //untill gambler wins.
			{
				random=r.nextFloat(); //generate random number.
					//if random value less than or equal to 0.5 gambler loss.
				if(random<=0.5) 
				{
					same_stake-=1;
				}
					//if random value greater than to 0.5 gambler win.
				else
				{
					same_stake+=1;
				}
					//if gambler broke(i.e. has no money) break the loop.
				if(same_stake==0)
				{
					break;
				}
			}
			System.out.println("your stake value for the "+i+" game is "+same_stake);
			if(same_stake==0)
			{
				loss++; //count of loss.
			}
			else
			{
				win++; //count of win.
			}
		}
		percent_of_win=(float) win*100/number; //win percentage.
		percent_of_loss=(float) loss*100/number; //loss percentage.
		System.out.println("The number of wins = "+win+ " percentage of win = "+percent_of_win+ " % percentage of loss = "+percent_of_loss+ "%.");
	}
}
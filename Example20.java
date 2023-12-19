package com.jsp.PatternPrograms;

public class Example20 {

	public static void main(String[] args) {

		int n=9;
		int sp=0;
		int st=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				if(k==1||k==st||i==1||i==n)
				{
					System.out.print("* "); //if try to do without if condition then its solid pattern ,now its hallow
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<=n/2)
			{
				st--;
				sp++;
			}
			else {
				st++;
				sp--;
			}
			System.out.println();
		}
	}
}
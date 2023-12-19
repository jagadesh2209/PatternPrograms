package com.jsp.PatternPrograms;

public class Example18 {

	public static void main(String[] args) {

		int n=5;
		int st=1;
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==n||k==1||k==i)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			st++;
			System.out.println();
			sp--;
		}
	}

}

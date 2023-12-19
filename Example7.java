package com.jsp.PatternPrograms;

public class Example7 {

	public static void main(String[] args) {
		
		int n=5;
		int sp=n-1;
		int st=1;
		int t=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				if(k<=st/2)
				{
					System.out.print(t++);
				}
				else {
					System.out.print(t--);
				}
			}
			st+=2;
			sp--;
			t=1;
			System.out.println();
		}
	}
}

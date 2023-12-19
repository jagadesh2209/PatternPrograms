package com.jsp.PatternPrograms;

public class Example14 {

	public static void main(String[] args) {

		int n=4;
		char ch='A';
		int st=1;
		int sp=n-1;
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
					System.out.print(ch++);
				}
				else {
					System.out.print(ch--);
				}
			}
			System.out.println();
			st+=2;
			sp--;
			ch='A';
		}
				
	}

}

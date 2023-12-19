package com.jsp.PatternPrograms;

public class Example24 {

	public static void main(String[] args) {
		int n=5;
		int sp=0;
		int t=n;
		int st=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=t;k++)
			{
				if(i%2==0)
				{
					System.out.print(++st);
				}
				else {
					System.out.print(st--);
				}
			}
			t--;
			sp++;
			System.out.println();
		}

	}

}

package com.jsp.PatternPrograms;

public class Example19 {

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
				System.out.print("*");
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

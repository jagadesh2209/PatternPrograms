package com.jsp.PatternPrograms;

public class Example29 {

	public static void main(String[] args) {
		int n=9;
		int sp=0;
		int t=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=t;k>=1;k--)
			{
				if(k==t||k==1)
				{
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=n/2)
			{
				t++;
			}
			else {
				t--;
			}
			System.out.println();
		}
	}
}

package com.jsp.PatternPrograms;

public class Example {

	public static void main(String[] args) {
		
		int n=5;
		int sp=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=1;k--)
			{
				if(i==1)
				{
					System.out.print(k);
				}
				else {
					System.out.print(" ");//pending
				}
			}
			System.out.println();
			sp++;
		}

	}

}

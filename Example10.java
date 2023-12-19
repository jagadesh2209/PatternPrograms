package com.jsp.PatternPrograms;

public class Example10 {

	public static void main(String[] args) {
		
		int n=5;
		int sp=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			sp++;
			System.out.println();
		}
	}
}

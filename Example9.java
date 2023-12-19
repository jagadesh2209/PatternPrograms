package com.jsp.PatternPrograms;

public class Example9 {

	public static void main(String[] args) {
		
		int n=5;
		int st=n;
		int sp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=st;k>=i;k--)
			{
				System.out.print(k);
			}
			sp++;
			System.out.println();
		}
	}

}

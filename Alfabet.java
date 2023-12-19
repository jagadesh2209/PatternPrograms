package com.jsp.PatternPrograms;

public class Alfabet {

	public static void main(String[] args) 
	{
		int n=5;
		int count=n;
		int k=1;
		
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<count;j++ )
			{
				System.out.print('A');
			}
			for(int j=1;j<=k;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			count--;
			k++;
			ch++;
		}
	}
}

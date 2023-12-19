package com.jsp.PatternPrograms;

public class Example25 {

	public static void main(String[] args) {

		int n=5;
		int s=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				if(i%2!=0)
				{
					System.out.print(s++);
				}
				else {
					System.out.print(--s);
				}
			}
			System.out.println();
		}
	}
}

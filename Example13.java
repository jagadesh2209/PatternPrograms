package com.jsp.PatternPrograms;

public class Example13 {

	public static void main(String[] args) {
		
		int n=5;
		int sp=n-1;
		
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				if(k==i||i==n)
				{
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			temp++;
			sp--;
			System.out.println();
		}
	}
}

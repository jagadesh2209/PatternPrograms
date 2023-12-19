package com.jsp.PatternPrograms;

public class JShape {

	public static void main(String[] args) {

		int n=5;
		int p=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==p+1||i==n-1&&j==1||i==n&&j==2)
				{
					System.out.print("P ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

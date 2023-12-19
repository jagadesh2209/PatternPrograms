package com.jsp.PatternPrograms;

public class PShape {

	public static void main(String[] args) {

		int n=5;
		int st=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n&&j<=st||i==1&&j<=st||i==3&&j<=st||i==2&&j==n)
				{
					System.out.print("J");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}

package com.jsp.PatternPrograms;

public class HallowShape {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)//here its i value is same for the complete one loop i=1 its check only one cond bcz its OR operater
				{
					System.out.print(j );
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

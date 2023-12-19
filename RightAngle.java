package com.jsp.PatternPrograms;

public class RightAngle {

	public static void main(String[] args) 
	{
		int n=9;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			if(i<=n/2)
			{
				st++;
			}
			else {
				st--;
			}
		}
	}
}

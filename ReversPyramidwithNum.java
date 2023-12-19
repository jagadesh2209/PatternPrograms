package com.jsp.PatternPrograms;

public class ReversPyramidwithNum {

	public static void main(String[] args) {
		
		int n=5;
		int sp=1;
		int st=(n*2)-1;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=2;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int t=n;
			for(int k=1;k<=st;k++)
			{
				if(k<=st/2)
				{
					System.out.print(t--);
				}
				else {
					System.out.print(t++);
				}
			}
			System.out.println();
			sp++;
			st-=2;
		}
	}
}

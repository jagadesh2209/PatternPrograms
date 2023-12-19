package com.jsp.PatternPrograms;

public class Example5 {

	public static void main(String[] args) {
		
		int n=4;
		int st=(n*2)-1;
		int sp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<sp;j++)
			{
				System.out.print(" ");
			}
			int p=1;
			for(int k=1;k<=st;k++)
			{
				if(k<=st/2)
				{
					System.out.print(p++);
				}
				else {
					System.out.print(p--);
				}
			}
			sp++;
			st-=2;
			System.out.println();
		}
	}

}

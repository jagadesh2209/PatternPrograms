package com.jsp.PatternPrograms;

public class Example6 {

	public static void main(String[] args) {
		
		int n=4;
		int st=(n*2)-1;
		int sp=1;
		
		for(int i=n;i>=1;i--)
		{
			int p=i;
			for(int j=1;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				if(k<=st/2)
				{
					System.out.print(p--);
				}
				else {
					System.out.print(p++);
				}
			}
			st-=2;
			sp++;
			System.out.println();
		}

	}

}

package com.jsp.PatternPrograms;

public class Example12 {

	public static void main(String[] args) {

		int n=5;
		int st=(n*2)-1;
		int sp=0;
		
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				if(k<=st/2)
				{
					System.out.print(temp++);
				}
				else{
					System.out.print(temp--);
				}
			}
			sp++;
			st-=2;
			System.out.println();
		}
		
	}

}

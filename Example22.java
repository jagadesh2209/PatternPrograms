package com.jsp.PatternPrograms;

public class Example22 {

	public static void main(String[] args) {

		int n=5;
		int st=1;
		int sp=n-1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int v=1;
			for(int k=1;k<=st;k++)
			{
				if(i==n) 
				{
					if(k<=st/2)
					{
						System.out.print(v++);
					}
					else 
					{
						System.out.print(v--);
					}
				}
				else if(k==1 || k==st) 
				{
					System.out.print(1);
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			sp--;
			System.out.println();
			st+=2;
		}
	}

}

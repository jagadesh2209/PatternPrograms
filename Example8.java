package com.jsp.PatternPrograms;

public class Example8 {

	public static void main(String[] args) {
		
		int n=4;
		int st=1;
		int sp=n-1;
		int t=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=st;k++)
	 		{
				if(k<=st/2)
				{
					System.out.print(t++);
				}
				else {
					System.out.print(t--);
				}
			}
			st+=2;
			sp--;
			System.out.println();
		}
	}

}

package com.jsp.PatternPrograms;

public class Example11 {

	public static void main(String[] args) {

		int n=5;
		int sp=0;
		int v=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2!=0)
				{
					System.out.print(v++);
				}
				else {
					System.out.print(--v);
				}
			}
			sp++;
			System.out.println();
		}
	}

}

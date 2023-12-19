package com.jsp.PatternPrograms;

public class PyramidNumber {

	public static void main(String[] args) {
		int n=5;
		int x=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int a=x+1;
				for(int j=1;j<=i;j++)
				{
					System.out.print(a+"\t");
					a++;
				}
			}
			else {
				x=(i*(i+1))/2;
				int y=x;
				for(int j=1;j<=i;j++)
				{
					System.out.print(y+"\t");
					y--;
				}
			}
			System.out.println();
		}

	}

}

package com.jsp.PatternPrograms;

public class Example26 {

	public static void main(String[] args) {

		int n=9;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=st;j>=1;j--)
			{
				System.out.print(j);
			}
			if(i<=n/2)
			{
				st++;
			}
			else {
				st--;
			}
			System.out.println();
		}
	}

}

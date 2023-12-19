package com.jsp.PatternPrograms;

public class Example27 {

	public static void main(String[] args) {

		int n=9;
		int st=1;
		int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=st;k>=1;k--)
			{
				if(k==1||k==st)
				{
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=n/2)
			{
				sp--;
				st++;
			}
			else {
				sp++;
				st--;
			}
			System.out.println();
		}
	}

}

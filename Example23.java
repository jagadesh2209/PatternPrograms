package com.jsp.PatternPrograms;

public class Example23 {

	public static void main(String[] args) {

		int n=7;
		int st=1;
		int sp=n/2;
		int t=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=st;k>=1;k--)
			{
				System.out.print(k);
			}
			if(i<n/2)
			{
			st++;
			sp--;
				
			}else {
				sp++;
				st--;
				
			}
			
			System.out.println();
		}
	}

}

package com.jsp.PatternPrograms;

public class HallowLeftAngleNum {

	public static void main(String[] args) {
		
		int n=5;
		int sp=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				if(i==1||k==n||k==i)
				{
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			sp++;
			System.out.println();
		}
	}
}

package com.jsp.PatternPrograms;

public class HallowRightAngleNum {

	public static void main(String[] args) {
		
		int n=5;
		int sp=n-1;
		int t=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int k=t;k<=n;k++)
			{
				if(k==i||k==n||i==1)
				{
					System.out.print(k+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			t--;
			sp--;
			System.out.println();
		}
	}
}

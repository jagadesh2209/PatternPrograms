package com.jsp.PatternPrograms;

public class HallowNumberRightAngle2 {
	public static void main(String[] args) {
		
		int n=5;
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1||k==i||i==n)
				{
					System.out.print(k+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
			sp--;
		}
	}
}

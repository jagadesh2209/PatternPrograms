package com.jsp.PatternPrograms;

public class Example17 {

	public static void main(String[] args) {

		int n=5;
		int sp=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==n||k==i||k==1)
				{
					System.out.print(k+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			sp++;
			System.out.println();
		}
	}
}

//for(int i=n;i>=1;i--)
//{
//	for(int j=1;j<=sp;j++)
//	{
//		System.out.print(" ");
//	}
//	for(int k=i;k>=1;k--)
//	{
//		if(i==n||k==1||k==i)
//		{
//			System.out.print("* ");
//		}
//		else {
//			System.out.print("  ");
//		}
//	}
//	sp++;
//	System.out.println();
//}

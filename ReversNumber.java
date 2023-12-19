package com.jsp.PatternPrograms;

public class ReversNumber {

	public static void main(String[] args) {
		int n=4;
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
			sp--;
		}
		
//		int n=5;
//		int sp=n-1;
//		char c='A';
//		for(int i=1;i<=n;c++)
//		{
//			for(int j=1;j<=sp;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i;k>=1;k--)
//			{
//				System.out.print(c);
//			}
//			System.out.println();
////	 
		
		

	}

}

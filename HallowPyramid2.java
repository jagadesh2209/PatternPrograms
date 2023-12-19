package com.jsp.PatternPrograms;

public class HallowPyramid2 {

	public static void main(String[] args) {
		int n=10;
		int sp=0;//or sp=n-1;
		int st=n-1;//or st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j==1||j==st||i==1)//or use the i==n 
				{
					System.out.print("  * ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println();
			sp++;//--;
			st--;//++;
		}
	}
}

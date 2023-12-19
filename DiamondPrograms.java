package com.jsp.PatternPrograms;

public class DiamondPrograms {

	public static void main(String[] args) {
		int n=9;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int p=1;p<=st;p++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if(i<=n/2) {
				sp--;
				st++;
			}
			else {
				sp++;
				st--;
			}
		}
	}
}

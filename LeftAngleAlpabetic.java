package com.jsp.PatternPrograms;

public class LeftAngleAlpabetic {

	public static void main(String[] args) {
		char ch='P';
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)//  i=1   1<=5 true
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch--;
		}
	}
}

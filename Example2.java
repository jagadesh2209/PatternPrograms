package com.jsp.PatternPrograms;

public class Example2 {

	public static void main(String[] args) {
		
		int n=9;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
			if(i<n/2)
			{
				num++;
			}
			else {
				num--;
			}
		}
	}
}

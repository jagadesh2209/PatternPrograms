package com.jsp.PatternPrograms;

public class Example1 {
	public static void main(String[] args) {
		int n=9,st=n, sp=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			 for(int k=1;k<=st;k++){
				 //if(k==1||i==1||i==n||k==st)
				 System.out.print("*");
				 //else
					// System.out.print(" "); 
			 }
			 if(i<=n/2) {
				 st-=2;
				 sp++;
			 }
			 else {
				 st+=2;
				 sp--;
			 }
			System.out.println();
		}
	}

}

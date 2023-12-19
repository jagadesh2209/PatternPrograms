package com.jsp.PatternPrograms;

public class XShape {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j||i+j==n+1){
					System.out.print("*");//we want to print the numbers use I and J.
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

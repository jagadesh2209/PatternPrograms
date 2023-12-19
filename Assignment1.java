package com.jsp.PatternPrograms;

public class Assignment1 {

	public static void main(String[] args) {

		int n=5,st=n,sp=0,p=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++){
				if(i%2!=0){
					System.out.print(p++);
				}
				else {
					System.out.print(--p);
				}
			}
			System.out.println();
			sp++;
			st--;
		}
	} 
}
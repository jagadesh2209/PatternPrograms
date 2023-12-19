package com.jsp.PatternPrograms;

public class pattern1 {

	public static void main(String[] args) {
		int n=4;
		int st=(n*2)-1;
		int sp=0;
		int t=1;
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1;j<=sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=st; j++) {
				
				if(j<=st/2) {
					System.out.print(t++);
				}else {
					System.out.print(t--);
				}
			}
			t=1;
			System.out.println();
			st-=2;
			sp++;
		}
	}
}

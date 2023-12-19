package com.jsp.PatternPrograms;

public class SnakePattern {

		public static void main(String[] args) {
			
			int n=5;
			for(int i=1;i<=n;i++)
			{
				int x=((i-1)*n)+1;
				if(i%2!=0)
				{
					for(int j=1;j<=n;j++)
					{
						System.out.print(x+" \t");
						x++;
					}
					System.out.println();
				} 
				else {
					x=i*n;
					int y=x;
					for(int j=1;j<=n;j++)
					{
						System.out.print(y+" \t");
						y--;
					}
					System.out.println();
				}
			}
		}
}


package com.jsp.PatternPrograms;

public class ReversAccordingToLength {

	public static void main(String[] args) {
		String s="7++e6 students are excellent";
		String[] arr=s.split(" ");
		String replace=s.replace(" ", "");
		char[] a=reverse(replace);
		String res="";
		int i=0,j=0;
		while(i<a.length)
		{
			String temp="";
			int k=0;
			while(i<a.length&&k<arr[j].length())
			{
				temp+=a[i];
				i++;
				k++;
			}
			res+=temp+" ";
			j++;
		}
     System.out.println(res);
	}
	
	public static char[] reverse(String s)
	{
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return c;
	}
}

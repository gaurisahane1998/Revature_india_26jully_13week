package com.revature;

public class Mytask2 {
	public static void main(String[] args) {
		String s="hello gauri and amol how are you ";
		System.out.println(converOddLengthUpper(s));
	}
	static String converOddLengthUpper(String s)
	{
		String arr[]=s.split(" ");
		StringBuilder sb = new StringBuilder();
		int l;
		for(int w=0;w<arr.length;w++)
		{
			 l=arr[w].length();
			 if(l%2==0)
			 {
				 sb.append(Character.toUpperCase(arr[w].charAt(0))).append(arr[w].substring(1)).append(" ");
			 }
			 else
			 {
				 int d=l/2;
				 sb.append(arr[w].substring(0,d)).append(Character.toUpperCase(arr[w].charAt(d))).append(arr[w].substring(d+1)).append(" ");
			 }
			
		}
		return sb.toString().trim();
		}
	}

		
	



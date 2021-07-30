package com.revature;

public class Mytask1 {
	public static void main(String[] args) {
			String s="hello gauri what are you doing ";
			System.out.println(convertLastLetter(s));
		}
		public static String convertLastLetter(String s) {
			String ar[]=s.split(" ");
			StringBuilder sb=new StringBuilder();
			int i;
			for (int w = 0; w < ar.length; w++) {
				i=ar[w].length()-1;
				sb.append(ar[w].substring(0,i)).append(Character.toUpperCase(ar[w].charAt(i))).append(" ");
			}
			return sb.toString().trim();
		}
		

	}



package com.revature;

public class Mytask3 {
	public static void main(String[] args) {
		String s="may i come in madam";
		System.out.println(checkPlaindromeSentense(s));
	}
	static String checkPlaindromeSentense(String s)
	{
		String ar[]=s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<ar.length;i++)
		{
			if(isPalindromeShortHand(ar[i])==false)
			{
				StringBuilder sb1 = new StringBuilder(ar[i]);
				sb1.reverse();
				String s1=sb1.toString();
				sb.append(sb1).append(" ");
				
			}
			else
			{
				sb.append(ar[i]).append(" ");
			}
			
		}
		return sb.toString().trim();
	}
	public static boolean isPalindromeShortHand(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}




package com.revature;

public class Second {

	static String checksecure(String str)
	{
		if(str.startsWith("https://"))
			{return "secure";}
		else
		if(str.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("hellrevature.com/wiki/Main_Page"));
	
		
	}
}

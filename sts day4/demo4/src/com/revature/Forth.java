package com.revature;

public class Forth {
		
static double hypo(double a,double b)
{
	double c=(float)Math.pow((a*a+b*b), 0.5);
	return c;
}

public static void main(String[] args) {
	
	System.out.println((int)hypo(3,5));
	System.out.println(hypo(37.3,13.6));

}

}

		
		



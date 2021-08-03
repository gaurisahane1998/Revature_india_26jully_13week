package com.revature;

public class Dimesions {
private int area =0;
    
	public int square(int s){
		area= s*s;
		return area;
	}
	public int rectangle(int l,int b){
		area= l*b;
		return area;	
	}
	public double trapezium(double a,double b,double h){
	 double z= ((a+b)/2)*h;
	 
		return z;
	}
	
}




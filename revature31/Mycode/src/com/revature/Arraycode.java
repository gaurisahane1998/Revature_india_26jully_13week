package com.revature;

public class Arraycode {
	
		static boolean islastfirstsame(int x) 
		{
			String str=Integer.toString(x);
			int i=str.length()-1;
			int a=x/(int)Math.pow(10, i);
			int b=x%10;

			if(a==b)
			{return true;}
			else
				return false;
		}
		public static void main(String[] args) {
			int arr[]= {212,213,334,50675,5050,907909,71987,171,67};
			for(int x:arr)
			{
				if(islastfirstsame(x))
					System.out.print(x+" ");
			}
		}
}



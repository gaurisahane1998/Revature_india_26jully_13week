package com.revature;

public class Arraysforth {

		static boolean palindrome(int x) 
		{
			String str=Integer.toString(x);
			StringBuffer sb= new StringBuffer(str);
			sb=sb.reverse();
			//System.out.println(str+" "+sb.toString());
			if(str.equals(sb.toString()))
			{return true;}
			else
				return false;
		}
		public static void main(String[] args) {
			int arr[]= {121,121,34,303,4040,6006,789987,1221,123312,141441415,676,88,9};
			for(int x:arr)
			{
				if(palindrome(x))
					System.out.print(x+" ");
			}

		}


}

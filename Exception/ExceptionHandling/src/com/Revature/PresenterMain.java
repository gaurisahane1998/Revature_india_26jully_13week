package com.Revature;

public class PresenterMain {
	public static void main(String[]args) {
		
		BusinessValidation b1=new BusinessValidation();
		try {
			if(b1.isValidPassword("XYZdef13*")) {
				System.out.println("Pass Validated");
			}
			}catch(InvalidPassException e){
				System.out.println(e.getMessage());
			}

	}
}

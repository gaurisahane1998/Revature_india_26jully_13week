package com_Revature;

public class PresenterMain {
public static void main(String[]args) {
		
		BusinessValidation b1=new BusinessValidation();
		try {
			if(b1.isValidPassword("XYZdef5*")) {
				System.out.println("Pan Validated");
			}
			}catch(InvalidPassException e){
				System.out.println(e.getMessage());
			}

	}
}



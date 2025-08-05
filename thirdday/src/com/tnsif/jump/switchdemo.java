package com.tnsif.jump;

public class switchdemo {

	public static void main(String[] args) {
		
		int userInputs=1;
		switch(userInputs)
		{
		case 1:
			System.out.println(userInputs + ":current plan details");
			break;
			
		case 2:
			System.out.println(userInputs + ":New offers");
			break;
			
		case 3:
			System.out.println(userInputs + ":talk to you later" );
			break;

		case 4:
			System.out.println(userInputs + ":new plan for u");
			break;
			
			default : System.out.println("your inputs is invaild!  \n Exit..");
		}
		
		
		

	}

}

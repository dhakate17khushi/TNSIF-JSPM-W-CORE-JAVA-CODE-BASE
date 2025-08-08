package com.tnsif.dayfourth;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		//scanner class
		//scanner object to accept user inputs
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter Person Name:");
		String name=ob.next();
		System.out.println("Enter Age");
		int age=ob.nextInt();
		System.out.println("Enter gender");
		String gender=ob.next();
		System.out.println("Enter income");
		int income=ob.nextInt();

	   
		person person=new person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		//display person details using to string() method
		System.out.println(person);
		
		TaxCalculation cal=new TaxCalculation();
		cal.calculateTax(person);
		System.out.println("After calulation of tax:");
		
		System.out.println(person);

	}

}

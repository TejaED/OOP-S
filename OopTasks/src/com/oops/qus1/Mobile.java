package com.oops.qus1;

import java.util.Scanner;

public class Mobile {
	public void contactPerson(String name) {
		System.out.println(name);
	}

	public void contactDetails(String mobile1) {
		System.out.println(mobile1+" "+"your mobile number is saved ");
	}

	public void contactDetails(String mobile1, String mobile2) {
		System.out.println(mobile1+","+mobile2+" "+"your two mobile number are saved");
	}
	public void contactDetails(String mobile1, String mobile2,String mobile3) {
		System.out.println(mobile1+","+mobile2+","+mobile3+" "+"your two mobile number are saved");
	}

	

	public static void main(String[] args) {
		System.out.println("please enter how many mobile numbers do you have.....");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Mobile m = new Mobile();
		System.out.println("please enter your name");
		String name = sc.next();
		m.contactPerson(name);
		switch (a) {
		case 1:
			System.out.println("Hi"+" "+name+" "+" please enter you only mobile number");
			String oneMoblieNumber = sc.next();
			m.contactDetails(oneMoblieNumber);
			break;
		case 2:
			System.out.println("Hi"+" "+name+" please enter you two mobile number");
			String moblieNumber1 = sc.next();
			String moblieNumber2 = sc.next();
			m.contactDetails( moblieNumber1, moblieNumber2);
			break;
		case 3:
			System.out.println("Hi"+" "+name+" please enter you three mobile number");
			String number1 = sc.next();
			String number2 = sc.next();
			String number3 = sc.next();
			m.contactDetails(number1, number2,number3);
			break;
		default:
			System.out.println("your take one mobile number");
			break;
		}
	}

}

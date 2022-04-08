package controlStatementPackage;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter Age of persion");
		age = sa.nextInt();
		switch(age) {
		case 1:
			System.out.println("Your age is 1");
			break;
			
		case 2:
				System.out.println("Your age is 2");
				break;
				
		default:
			System.out.println("Your age is other than 1 and 2");
			break;
		}
			
}
}


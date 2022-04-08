package controlStatementPackage;

import java.util.Scanner;

public class IF_ELSE_IF_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter Age of persion");
		age = sa.nextInt();
		if(age > 50) {
			System.out.println("Your age is greater than 50 " + age);
			
		}else if(age > 20 && age <50) {
			System.out.println("Your age is in between 20 and 50 " + age);
		}else {
			System.out.println("Your are is less than 50 " + age);
	}
	}

}

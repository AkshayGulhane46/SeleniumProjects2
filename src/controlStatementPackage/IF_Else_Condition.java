package controlStatementPackage;

import java.util.Scanner;

public class IF_Else_Condition {
	public static void main(String args[]) {
		int age;
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter Age of persion");
		age = sa.nextInt();
		if(age > 50) {
			System.out.println("Your age is greater than 50");
			
		}else {
			System.out.println("Your age is less than 50");
		}
	}
}

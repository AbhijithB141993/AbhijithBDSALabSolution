package com.greatlearning.labsolution_Q1;

import java.util.Scanner;

public class BalancingBracketDriver {

	public static void main(String[] args) {

		BalancingBrackets balanceBrackets = new BalancingBrackets();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Paranthesis:");
		String brackets = sc.nextLine();
		boolean res = balanceBrackets.checkingBracketsBalanced(brackets);
		if (res) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");

		}
		sc.close();

	}
}
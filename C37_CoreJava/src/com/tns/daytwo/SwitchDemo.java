package com.tns.daytwo;
public class SwitchDemo {
	public static void main(String[] args) {
		char x = 'a';
		switch (x) {
		case 'a':
		case 'A':
			System.out.println(x + " is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x + " is a Digit");
			break;
		case 'r':
		case 'R':
			System.out.println(x + " is White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x + " is Special Symbol");
		default:
			System.out.println(x + " is other than letter, digit, space or special symbol ");
			break;
		}
	}
}

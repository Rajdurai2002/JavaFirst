package demo;

import java.util.Scanner;

public class BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		System.out.println("Good Morning");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : \n");
		String name = sc.nextLine();
		System.out.print("Your name is "+name);
	}
}

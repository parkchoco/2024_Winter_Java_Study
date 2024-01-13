package exercise;

import java.util.Scanner;

public class Ex_Ch2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's your age?");
		int age = input.nextInt();
		
		System.out.println("You will be " + (age + 1) +" next year.");
		
		input.close();
	}
}
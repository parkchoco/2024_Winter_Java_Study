package chap02;

import java.util.Scanner;

public class Project_11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		final double DOLLAR = 1100;
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = input.nextInt();
		
		System.out.println(won + "원은 $" + (double)won/DOLLAR + "입니다.");
		
		
		
		input.close();
	}
}

package chap02;

import java.util.Scanner;

public class Project_08 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		char grade;
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = input.nextInt();
		
		
		switch(score/10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		
		input.close();
	}
}
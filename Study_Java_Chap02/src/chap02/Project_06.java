package chap02;

import java.util.Scanner;

public class Project_06 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		char grade;
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = input.nextInt();
		
		if((score<=100)&&(90<=score)) {
			grade = 'A';
		}
		else if((score<=90)&&(80<=score)) {
			grade = 'B';
		}
		else if((score<=80)&&(70<=score)) {
			grade = 'C';
		}
		else if((score<=70)&&(60<=score)) {
			grade = 'D';
		}
		else if((score<=60)&&(0<=score)) {
			grade = 'F';
		}
		else {
			grade = 'X';
		}
		
		System.out.println("학점은 " + grade+"입니다.");
		 
		
		input.close();
	}
}
package chap02;

import java.util.Scanner;

public class Project_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = input.nextInt();
		
		if(score>=90) {
			System.out.println("축하합니다! 합격입니다!");
		}
		else {
			System.out.println("죄송합니다. 불합격입니다.");
		}
		
		input.close();
	}

}

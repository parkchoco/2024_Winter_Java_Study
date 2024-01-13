package exercise;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_Ch3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0, score = 0;
		System.out.println("국어, 영어, 수학 점수를 차례로 입력하시오:");
		
		for(int i=0;i<3;i++) {
			System.out.print(">>");
			try {
				score = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("잘못 입력하였습니다. 다시입력해주세요.");
				input.nextLine();
				i--;
				continue;
			}
			sum+=score;
		}		
		System.out.println((double)sum/3);
		input.close();
	}
}

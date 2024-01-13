package chap03;

//InputMismatchException input.nextInt();에서 정수가 아닌 문자를 입력 받았을때 발생

import java.util.Scanner;
import java.util.InputMismatchException;

public class Project_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0, n = 0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				input.nextLine();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("합은" + sum);
		
		input.close();
	}
}

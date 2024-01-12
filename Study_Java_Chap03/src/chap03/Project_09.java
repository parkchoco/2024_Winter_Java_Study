package chap03;

//ArithmeticException 정수를 0으로 나눌때 발생

import java.util.Scanner;

public class Project_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("나눔수를 입렵하시오:");
			int divided = input.nextInt();
			System.out.print("나눗수를 입력하시오:");
			int divisor = input.nextInt();
			try {
				System.out.println(divided + "를 " + divisor + "로 나누면 몫은 "
						+ divided/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		
		
	input.close();	
	}
}

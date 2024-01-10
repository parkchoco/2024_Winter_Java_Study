package chap02;

//2장 가위, 바위, 보 게임

import java.util.Scanner;

public class Project_10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		String select_1 = input.next();
		
		System.out.print("영희 >> ");
		String select_2 = input.next();
		
		switch(select_1) {
		case "가위":
			num1 = 0;
			break;
		case "바위":
			num1 = 1;
			break;
		case "보":
			num1 = 2;
		}
		
		switch(select_2) {
		case "가위":
			num2 = 0;
			break;
		case "바위":
			num2 = 1;
			break;
		case "보":
			num2 = 2;
		}
		
		if(num1==num2) {
			System.out.println("비겼습니다.");
		}
		else if((num1+1)%3==num2) {
			System.out.println("영희가 이겼습니다.");
		}
		else {
			System.out.println("철수가 이겼습니다.");
		}
		
		input.close();
	}
}

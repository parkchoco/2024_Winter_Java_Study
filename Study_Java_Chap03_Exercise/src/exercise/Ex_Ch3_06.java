package exercise;

import java.util.Scanner;

public class Ex_Ch3_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int charge;
		int money;
		
		System.out.print("금액을 입력하시오>> ");
		money = input.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			charge = money / unit[i];
			money %= unit[i];
			if(charge!=0)
				System.out.println(unit[i] + "원 짜리 : " + charge);
		}
		
		input.close();
	}
}

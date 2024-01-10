package chap02;

import java.util.Scanner;

public class Project_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C50000, C10000, C1000, C100, C50, C10, C1;
		
		System.out.print("금액을 입력하시오>>");
		int money = input.nextInt();
		
		C50000=money/50000;
		money=money%50000;
		C10000 = money/10000;
		money=money%10000;
		C1000 = money/1000;
		money=money%1000;
		C100 = money/100;
		money=money%100;
		C50 = money/50;
		money=money%50;
		C10 = money/10;
		money=money%10;
		C1 = money/1;
		money=money%1;
		
		System.out.println("오만원권 " + C50000 + "매");
		System.out.println("만원권 " + C10000 + "매");
		System.out.println("천원권 " + C1000 + "매");
		System.out.println("백원 " + C100 + "매");
		System.out.println("오십원 " + C50 + "매");
		System.out.println("십원 " + C10 + "매");
		System.out.println("일원 " + C1 + "매");
		
		input.close();
	}

}
package chap03;

import java.util.Scanner;

public class Project_06 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int number[] = new int[5];
		
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0;i<5;i++) {
			number[i] = input.nextInt();
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		
		input.close();
	}
}

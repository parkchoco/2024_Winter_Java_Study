package exercise;

import java.util.Scanner;

public class Ex_Ch3_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("정수를 입력하시오:");
		number = input.nextInt();
		
		for(int i=0;i<number;i++) {
			for(int j=i;j<number;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}

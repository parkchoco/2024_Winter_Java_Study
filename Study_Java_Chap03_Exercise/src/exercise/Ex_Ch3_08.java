package exercise;

import java.util.Scanner;

public class Ex_Ch3_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number[] = new int[100];
		int n;
		
		System.out.print("정수 몇개? ");
		n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			number[i] = (int)(Math.random()*100+1);
			System.out.print(number[i] + "\t");
			if(i%10==9) {
				System.out.println();
			}
		}
		
		
		input.close();
	}
}

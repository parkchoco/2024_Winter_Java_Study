package exercise;

import java.util.Scanner;

public class Ex_Ch2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input start number(0~6):");
		int number = input.nextInt();
		
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<number;i++) {
			System.out.print("\t");
		}
		for(int i=1;i<=31;i++) {
			number++;
			System.out.print(i+"\t");
			if(number%7==0) {
				System.out.println();
			}
				
		}
		input.close();
	}
}

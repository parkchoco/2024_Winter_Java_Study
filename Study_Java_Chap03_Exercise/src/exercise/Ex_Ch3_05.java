package exercise;

import java.util.Scanner;

public class Ex_Ch3_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number[] = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		
		for(int i=0;i<number.length;i++) {
			number[i] = input.nextInt();
		}
		
		System.out.print("3�� ����� ");
		
		for(int i=0;i<number.length;i++) {
			if(number[i]%3==0) {
				System.out.print(number[i]+" ");
			}
		}
		
		input.close();
	}

}

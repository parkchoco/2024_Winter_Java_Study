package chap03;

import java.util.Scanner;

public class Project_06 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int number[] = new int[5];
		
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int i=0;i<5;i++) {
			number[i] = input.nextInt();
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		
		input.close();
	}
}

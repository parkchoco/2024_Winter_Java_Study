package chap02;

import java.util.Scanner;

public class Project_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = input.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~4):");
		int grade = input.nextInt();
		
		if(score>=60) {
			if(grade!=4) {
				System.out.println("�հ�!");
			}
			else if(score>=70) {
				System.out.println("�հ�!");
			}
			else {
				System.out.println("���հ�!");
			}
		}
		else
			System.out.println("���հ�!");
		
		input.close();
	}

}
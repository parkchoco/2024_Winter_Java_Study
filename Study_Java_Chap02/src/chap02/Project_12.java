package chap02;

import java.util.Scanner;

public class Project_12 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = input.nextInt();
		
		if(num%10==num/10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		input.close();
	}
}
package chap02;

import java.util.Scanner;

public class Project_11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		final double DOLLAR = 1100;
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
		int won = input.nextInt();
		
		System.out.println(won + "���� $" + (double)won/DOLLAR + "�Դϴ�.");
		
		
		
		input.close();
	}
}
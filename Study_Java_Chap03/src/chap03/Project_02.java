package chap03;

import java.util.Scanner;

public class Project_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count=0, sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int num = input.nextInt();
		
		while(num != -1) {
			count++;
			sum += num;
			num = input.nextInt();
		}
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		else {
		System.out.println("������ ������ " + count + "���̸� ����� " + (double)sum/count + "�Դϴ�.");
		}
		input.close();
	}

}

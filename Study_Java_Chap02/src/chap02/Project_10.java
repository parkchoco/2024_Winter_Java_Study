package chap02;

//2�� ����, ����, �� ����

import java.util.Scanner;

public class Project_10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("ö�� >> ");
		String select_1 = input.next();
		
		System.out.print("���� >> ");
		String select_2 = input.next();
		
		switch(select_1) {
		case "����":
			num1 = 0;
			break;
		case "����":
			num1 = 1;
			break;
		case "��":
			num1 = 2;
		}
		
		switch(select_2) {
		case "����":
			num2 = 0;
			break;
		case "����":
			num2 = 1;
			break;
		case "��":
			num2 = 2;
		}
		
		if(num1==num2) {
			System.out.println("�����ϴ�.");
		}
		else if((num1+1)%3==num2) {
			System.out.println("���� �̰���ϴ�.");
		}
		else {
			System.out.println("ö���� �̰���ϴ�.");
		}
		
		input.close();
	}
}
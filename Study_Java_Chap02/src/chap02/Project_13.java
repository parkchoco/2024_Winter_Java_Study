package chap02;

import java.util.Scanner;

public class Project_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C50000, C10000, C1000, C100, C50, C10, C1;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = input.nextInt();
		
		C50000=money/50000;
		money=money%50000;
		C10000 = money/10000;
		money=money%10000;
		C1000 = money/1000;
		money=money%1000;
		C100 = money/100;
		money=money%100;
		C50 = money/50;
		money=money%50;
		C10 = money/10;
		money=money%10;
		C1 = money/1;
		money=money%1;
		
		System.out.println("�������� " + C50000 + "��");
		System.out.println("������ " + C10000 + "��");
		System.out.println("õ���� " + C1000 + "��");
		System.out.println("��� " + C100 + "��");
		System.out.println("���ʿ� " + C50 + "��");
		System.out.println("�ʿ� " + C10 + "��");
		System.out.println("�Ͽ� " + C1 + "��");
		
		input.close();
	}

}
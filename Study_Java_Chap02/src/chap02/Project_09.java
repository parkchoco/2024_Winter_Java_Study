package chap02;

import java.util.Scanner;

public class Project_09 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int price = 0;
		
		System.out.print("���� Ŀ�� �帱���? ");
		String order = input.next();
		
		switch(order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2500;
			break;
		default:
			System.out.println("�޴��� �����ϴ�!");
		}
		
		System.out.println(order + "�� " + price + "���Դϴ�.");
		
		input.close();
	}
}
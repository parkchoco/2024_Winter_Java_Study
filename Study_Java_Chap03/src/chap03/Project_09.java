package chap03;

//ArithmeticException ������ 0���� ������ �߻�

import java.util.Scanner;

public class Project_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�:");
			int divided = input.nextInt();
			System.out.print("�������� �Է��Ͻÿ�:");
			int divisor = input.nextInt();
			try {
				System.out.println(divided + "�� " + divisor + "�� ������ ���� "
						+ divided/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		
		
	input.close();	
	}
}

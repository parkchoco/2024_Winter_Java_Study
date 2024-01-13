package chap03;

//InputMismatchException input.nextInt();���� ������ �ƴ� ���ڸ� �Է� �޾����� �߻�

import java.util.Scanner;
import java.util.InputMismatchException;

public class Project_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���.");
		int sum = 0, n = 0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				input.nextLine();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.println("����" + sum);
		
		input.close();
	}
}

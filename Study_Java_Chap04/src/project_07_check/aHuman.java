package project_07_check;

import java.util.Scanner;

public class aHuman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Human aHuman = new Human("ȫ�浿");
		
		aHuman.age = 21;
		aHuman.height = 180.5;
		aHuman.weight = 73.2;
		
		Human H[] = new Human[5];
		
		for(int i=0;i<H.length;i++) {
			String name = input.nextLine();
			H[i] = new Human(name);
		}
		input.close();
	}
}

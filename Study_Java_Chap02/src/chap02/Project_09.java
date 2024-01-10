package chap02;

import java.util.Scanner;

public class Project_09 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int price = 0;
		
		System.out.print("무슨 커피 드릴까요? ");
		String order = input.next();
		
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2500;
			break;
		default:
			System.out.println("메뉴에 없습니다!");
		}
		
		System.out.println(order + "는 " + price + "원입니다.");
		
		input.close();
	}
}

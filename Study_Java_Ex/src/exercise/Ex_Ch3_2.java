package exercise;

public class Ex_Ch3_2 {
	public static void main(String[] args) {
		int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=0;i<monthDays.length;i++) {
			System.out.println((i+1) + "월달의 날수는 " + monthDays[i] + "입니다.");
		}
		
	}
}

package exercise;

public class Ex_Ch3_13 {
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			if(i%10==3||i%10==6||i%10==9) {
				System.out.print(i + " �ڼ� ¦");
				if((i%30==3||i%30==6||i%30==9)&&i>10) {
					System.out.print("¦");
				}
				System.out.println();
			}
		}
		
	}
}

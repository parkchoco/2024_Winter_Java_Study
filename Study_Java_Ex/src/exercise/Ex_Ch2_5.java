package exercise;

public class Ex_Ch2_5 {
	public static void main(String[] args) {
		for(int i=0; i<100;i++) {
			System.out.print(i + "\t");
			if(i%10==9)
				System.out.println();
		}
	}
}

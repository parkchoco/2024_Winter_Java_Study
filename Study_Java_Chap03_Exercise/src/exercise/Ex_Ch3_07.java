package exercise;

public class Ex_Ch3_07 {
	public static void main(String[] args) {
		int number[] = new int[10];
		int sum =0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		
		for(int i=0;i<10;i++) {
			int j = (int)(Math.random()*10+1);
			number[i] = j;
			System.out.print(number[i] + " ");
			sum += number[i];
		}
		System.out.print("\nÆò±ÕÀº " + (double)sum/number.length);
	}
}

<<<<<<< HEAD
package chap03;

//NumberFormatException 문자열을 정수로 변환할 때 발생

public class Project_12 {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for(i=0;i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 " + j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}

}
=======
package chap03;

public class Project_12 {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for(i=0;i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 " + j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}

}
>>>>>>> refs/remotes/origin/main

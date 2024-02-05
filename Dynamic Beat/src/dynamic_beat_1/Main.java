package dynamic_beat_1;

public class Main {
	
	public static final int SCREEN_WIDTH = 1280; // 우리가 만들 게임의 전체 너비를 의미
	public static final int SCREEN_HEIGHT = 720; // 우리가 만들 게임의 전체 높이를 의미
	
	//public static 이란 모든 프로젝트 내부에서 공유 할 수 있는 하나의 변수를 의미
	//final은 한번 선언되면 바뀌지 않는 숫자를 의미 즉, 상수이다. 상수는 모두 대문자로 선언
	
	
	public static void main(String[] args) {
		new DynamicBeat();
	}
}

package dynamic_beat_1;

import javax.swing.JFrame;//ctrl + shift + o 자동으로 import

public class DynamicBeat extends JFrame{//JFrame은 GUI 기반의(그래픽) 프로그램을 만들기 위한 기본적으로 상속 받아야하는 부분
	public DynamicBeat() {
		setTitle("Dynamic Beat");// 만드는 게임의 이름
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 전체 게임 창의 크기를 설정
		setResizable(false);// 한번 만들어진 게임 창은 사용자가 인위적으로 줄이거나 크게 할 수 없다.
		setLocationRelativeTo(null);// 실행했을때 우리가 만든 게임창이 화면 정중앙에 나타나게 된다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임창을 종료했을때 프로그램 전체 종료. 안해주면 게임창을 꺼도 프로그램이 컴퓨터 내부에서 돌아가고 있다.
		setVisible(true);//우리가 만든 게임창이 정상적으로 컴퓨터 화면에 나타나도록 해준다.
	}
}
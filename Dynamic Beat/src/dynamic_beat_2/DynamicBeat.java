package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;//ctrl + shift + o 자동으로 import

public class DynamicBeat extends JFrame{//JFrame은 GUI 기반의(그래픽) 프로그램을 만들기 위한 기본적으로 상속 받아야하는 부분
	
	private Image screenImage;
	private Graphics screenGraphic;
	//더블 버퍼링을 위해서 전체 화면에 대한 이미지를 담는 인스턴스 위의 두 개
	
	private Image introBackground;//introBackground 이미지를 담을 수 있는 하나의 객체
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");// 만드는 게임의 이름
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 전체 게임 창의 크기를 설정
		setResizable(false);// 한번 만들어진 게임 창은 사용자가 인위적으로 줄이거나 크게 할 수 없다.
		setLocationRelativeTo(null);// 실행했을때 우리가 만든 게임창이 화면 정중앙에 나타나게 된다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임창을 종료했을때 프로그램 전체 종료. 안해주면 게임창을 꺼도 프로그램이 컴퓨터 내부에서 돌아가고 있다.
		setVisible(true);//우리가 만든 게임창이 정상적으로 컴퓨터 화면에 나타나도록 해준다.
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		//메인 클래스의 위치를 기반으로 하여 introBackground라는 이미지 파일을 얻어온 뒤에
		//그것의 이미지 인스턴스를 introBackground라는 이름의 이미지 변수에 초기화를 해주겠다는 뜻이다.
	}
	
	public void paint (Graphics g) {//paint함수는 GUI함수에서 가장먼저 화면을 그려주는 함수라 할 수 있다.
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		//SCREEN_WIDTH와 SCREEN_HEIGHT 크기 만큼의 이미지를 만들어준 뒤에 그것을 screenImage에 넣어주겠다.
		screenGraphic = screenImage.getGraphics();
		//screenImage를 이용해서 그래픽 객체를 얻어온다.
		screenDraw(screenGraphic);
		//screenGraphic의 그림을 그려주는 것이다.
		g.drawImage(screenImage, 0, 0, null);
		//screenImage를 0,0 의 위치에 그려준다.
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();// repaint를 해줌으로서 다시 paint함수를 불러온다. 프로그램이 종료될때까지 반복해서 그려준다.
	}
}
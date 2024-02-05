package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;//ctrl + shift + o �ڵ����� import

public class DynamicBeat extends JFrame{//JFrame�� GUI �����(�׷���) ���α׷��� ����� ���� �⺻������ ��� �޾ƾ��ϴ� �κ�
	
	private Image screenImage;
	private Graphics screenGraphic;
	//���� ���۸��� ���ؼ� ��ü ȭ�鿡 ���� �̹����� ��� �ν��Ͻ� ���� �� ��
	
	private Image introBackground;//introBackground �̹����� ���� �� �ִ� �ϳ��� ��ü
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");// ����� ������ �̸�
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ��ü ���� â�� ũ�⸦ ����
		setResizable(false);// �ѹ� ������� ���� â�� ����ڰ� ���������� ���̰ų� ũ�� �� �� ����.
		setLocationRelativeTo(null);// ���������� �츮�� ���� ����â�� ȭ�� ���߾ӿ� ��Ÿ���� �ȴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����â�� ���������� ���α׷� ��ü ����. �����ָ� ����â�� ���� ���α׷��� ��ǻ�� ���ο��� ���ư��� �ִ�.
		setVisible(true);//�츮�� ���� ����â�� ���������� ��ǻ�� ȭ�鿡 ��Ÿ������ ���ش�.
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		//���� Ŭ������ ��ġ�� ������� �Ͽ� introBackground��� �̹��� ������ ���� �ڿ�
		//�װ��� �̹��� �ν��Ͻ��� introBackground��� �̸��� �̹��� ������ �ʱ�ȭ�� ���ְڴٴ� ���̴�.
	}
	
	public void paint (Graphics g) {//paint�Լ��� GUI�Լ����� ������� ȭ���� �׷��ִ� �Լ��� �� �� �ִ�.
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		//SCREEN_WIDTH�� SCREEN_HEIGHT ũ�� ��ŭ�� �̹����� ������� �ڿ� �װ��� screenImage�� �־��ְڴ�.
		screenGraphic = screenImage.getGraphics();
		//screenImage�� �̿��ؼ� �׷��� ��ü�� ���´�.
		screenDraw(screenGraphic);
		//screenGraphic�� �׸��� �׷��ִ� ���̴�.
		g.drawImage(screenImage, 0, 0, null);
		//screenImage�� 0,0 �� ��ġ�� �׷��ش�.
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();// repaint�� �������μ� �ٽ� paint�Լ��� �ҷ��´�. ���α׷��� ����ɶ����� �ݺ��ؼ� �׷��ش�.
	}
}
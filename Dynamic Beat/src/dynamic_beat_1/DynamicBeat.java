package dynamic_beat_1;

import javax.swing.JFrame;//ctrl + shift + o �ڵ����� import

public class DynamicBeat extends JFrame{//JFrame�� GUI �����(�׷���) ���α׷��� ����� ���� �⺻������ ��� �޾ƾ��ϴ� �κ�
	public DynamicBeat() {
		setTitle("Dynamic Beat");// ����� ������ �̸�
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ��ü ���� â�� ũ�⸦ ����
		setResizable(false);// �ѹ� ������� ���� â�� ����ڰ� ���������� ���̰ų� ũ�� �� �� ����.
		setLocationRelativeTo(null);// ���������� �츮�� ���� ����â�� ȭ�� ���߾ӿ� ��Ÿ���� �ȴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����â�� ���������� ���α׷� ��ü ����. �����ָ� ����â�� ���� ���α׷��� ��ǻ�� ���ο��� ���ư��� �ִ�.
		setVisible(true);//�츮�� ���� ����â�� ���������� ��ǻ�� ȭ�鿡 ��Ÿ������ ���ش�.
	}
}
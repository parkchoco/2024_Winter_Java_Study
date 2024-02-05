package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {//Thread�� �ϳ��� ���� ���α׷��̶�� �� �� �ִ�. ���α׷� ���� ���� ���α׷�, thread�� ��� �޾��ش�.
	private Player player;//Player��°� �ڹ��� ����Ʈ�� �ִ� ���̺귯�� �� �ϳ��̴�(�ڹ��� : �뷡�� ����ǵ����ϱ� ���� ���̺�󸮸� �ٿ���� ����Ʈ)
	private boolean isLoop;//���� �ѹ��� ����Ǵ� ������ ���� �ݺ��ϴ���
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {// ������ : ���� ����� ���� ���ѹݺ������� ���θ� �Է� �޴´�
		try {//try - catch ���� ó���� ���� �����̴�
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());//������ ������ �� �ֵ��� ���ش�.
			//music�̶�� ���� �ȿ��ִ� �ش� �̸��� ������ �����Ų��. toURL�� �ش� ������ ��ġ�� ������ �� �ֵ��� ���ش�.
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			//�ش� ������ ���ۿ� ��Ƽ� �о� �� �� �ֵ��� ���ش�.
			player = new Player(bis);
			//player�� �ش� ������ ���� �� �ֵ��� ���ش�.
		} catch(Exception e) {//try �����ȿ��� ������ �߻��Ѵٸ� catch �������� �Ѿ��
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {//����ǰ� �ִ� ������ ���� � ��ġ�� ���� �ǰ� �ִ��� �˷��ش�.
		if(player==null)
			return 0;
		return player.getPosition();
	}
	
	public void close() {//������ ���� ������ �ǰ� �ִ����� �׻� ���� �� �� �ֵ��� ���ִ� �Լ��̴�.
		isLoop = false;
		player.close();
		this.interrupt();// �ش� �����带 ���� ���·� �����
	}
	
	@Override
	public void run() {//thread �Լ��� ��� ������ ������ ����ؾ� �ϴ� �Լ��̴�.
		try {//try���� �߿�
			do {//���� ���� ��Ű�� ��
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				//�ش� ������ ���ۿ� ��Ƽ� �о� �� �� �ֵ��� ���ش�.
				player = new Player(bis);
				//player�� �ش� ������ ���� �� �ֵ��� ���ش�.
			}while(isLoop);//isLoop�� true���̶�� ���ѹݺ��� �̷�������� ���ش�.
		}catch(Exception e) {
			System.out.println(e.getMessage());//������ �߻��� ��� �ش� ���� �޽����� �߻���Ų��.
		}
	}
}

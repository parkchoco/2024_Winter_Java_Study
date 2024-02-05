package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {//Thread는 하나의 작은 프로그램이라고 할 수 있다. 프로그램 안의 작은 프로그램, thread를 상속 받아준다.
	private Player player;//Player라는게 자바줌 사이트에 있던 라이브러리 중 하나이다(자바줌 : 노래가 재생되도록하기 위한 라이브라리를 다운받은 사이트)
	private boolean isLoop;//곡이 한번만 재생되는 것인지 무한 반복하는지
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {// 생성자 : 곡의 제목과 곡이 무한반복인지의 여부를 입력 받는다
		try {//try - catch 예외 처리를 위한 구문이다
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());//파일을 가져올 수 있도록 해준다.
			//music이라는 폴더 안에있는 해당 이름의 파일을 실행시킨다. toURL로 해당 파일의 위치를 가져올 수 있도록 해준다.
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			//해당 파일을 버퍼에 담아서 읽어 올 수 있도록 해준다.
			player = new Player(bis);
			//player는 해당 파을을 담을 수 있도록 해준다.
		} catch(Exception e) {//try 구문안에서 오류가 발생한다면 catch 구문으로 넘어간다
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {//실행되고 있는 음악이 현재 어떤 위치에 실행 되고 있는지 알려준다.
		if(player==null)
			return 0;
		return player.getPosition();
	}
	
	public void close() {//음악이 언제 실행이 되고 있던간데 항상 종료 할 수 있도록 해주는 함수이다.
		isLoop = false;
		player.close();
		this.interrupt();// 해당 스레드를 중지 상태로 만든다
	}
	
	@Override
	public void run() {//thread 함수를 상속 받으면 무조건 사용해야 하는 함수이다.
		try {//try구문 중요
			do {//곡을 실행 시키는 것
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				//해당 파일을 버퍼에 담아서 읽어 올 수 있도록 해준다.
				player = new Player(bis);
				//player는 해당 파을을 담을 수 있도록 해준다.
			}while(isLoop);//isLoop가 true값이라면 무한반복이 이루어지도록 해준다.
		}catch(Exception e) {
			System.out.println(e.getMessage());//오류가 발생한 경우 해당 오류 메시지를 발생시킨다.
		}
	}
}

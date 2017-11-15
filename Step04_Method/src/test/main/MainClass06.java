package test.main;
//다음 패키지에 있는 
import test.mypac.YourUtil;

public class MainClass06 {
	public static void main(String[] args) {
		
		//메세지를 전송 해 보세요.
		MyUtil.sendMessage();
		
		//화면을 캡쳐 해 보세요.
		MyUtil.screencapture();
		
		//파일을 다운로드 해보세요.
		YourUtil.fileDown();
		
		//파일을 업로드해보세요
		YourUtil.fileUp();
	}

}

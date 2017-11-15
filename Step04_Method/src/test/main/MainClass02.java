package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		
		MainClass02.showMsg("Hello~");
		
	    String str="안녕하세여";
		MainClass02.showMsg(str);
		
		//상황에 따라 null을 전달하는 경우도 있다.
		MainClass02.showMsg(null);
	}
	
	//static 맴버 메소드
	public static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}

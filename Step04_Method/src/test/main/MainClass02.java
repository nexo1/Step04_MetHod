package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		
		MainClass02.showMsg("Hello~");
		
	    String str="�ȳ��ϼ���";
		MainClass02.showMsg(str);
		
		//��Ȳ�� ���� null�� �����ϴ� ��쵵 �ִ�.
		MainClass02.showMsg(null);
	}
	
	//static �ɹ� �޼ҵ�
	public static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}

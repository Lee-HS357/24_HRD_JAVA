package day05;

public class PrintText implements Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintText pt = new PrintText();
		pt.printMe();
	}
	@Override
	public void printMe() {
		System.out.println("텍스트파일을 출력합니다.");
	}
}

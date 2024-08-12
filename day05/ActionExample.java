package day05;

public class ActionExample {
public interface Action{
	public void work();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			
		} 
	};
	action.work();
}
}

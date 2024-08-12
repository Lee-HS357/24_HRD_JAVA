package day05;
import java.awt.*;
class Button{
	//정적 중첩 인터페이스
	public static interface ClickListener{
		void onclick();
	}	
	private ClickListener clistener;
	public void setClickListener(ClickListener clistener) {
		this.clistener = clistener;
		
	}	
	public void onClick() {
		clistener.onclick();
	}
}

public class ButtonExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button okBtn= new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
	okBtn.setClickListener(new OkListener());
	okBtn.onClick();
	}
}

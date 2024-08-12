package day05;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingTest extends JFrame{
	JButton okBtn;
	
	public SwingTest() {
		super("첫번째 스윙 연습");
		//setTitle("타일틀");
		okBtn = new JButton("OK 버튼"); 
		MyListenner my= new MyListenner();
		
		okBtn.addActionListener(my);
		add(okBtn);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);;
		show();
	}
	
	// 내부 클래스(Inner Class로 이벤트 처리자 구현하기)
	class MyListenner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String result =e.getActionCommand();
			
			if(result.equals("OK")) {
				System.out.println("OK 버튼이 클릭됨");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingTest();
	}

}

package day02;

public class RefType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefType ref = new RefType();
		RefType ref2 = new RefType(); //생성자(구조체)
		if(ref==ref2) {
			System.out.println("동일한 주소를 갖는 객체이다.");			
		}else{
			System.out.println("서로 다른 주소를 갖는 객체이다.");
		}
		String name = new String("이현수");
		System.out.println(name);	
		String name2 = "오늘도 수고했어요";
		System.out.println(name2.length());
		
		int[] score = new int [5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		int sum = 0;
		for(int i= 0; i<score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("총합 : " + sum);
	}
}


package day03;

public class Jobapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// person 객체 생성
		Person lee = new Person();
		lee.age = 20;
		lee.name = "이순신";
		lee.먹다();
		lee.웃다();
		
		System.out.println(lee.age);
		System.out.println(lee.name);
	}

}

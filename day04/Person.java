package day04;

public class Person {
	// 객체 모델링(클래스 멤버)
	// 속성 (변수) : has -a
	int age;
	String name;
	char gender; //'F','M'
	String tel;
	
	// 기본 생성자
	public Person() {
		
	}
	// 메소드 getInfo()
	void getInfo() {
		System.out.println(this.name+"님의 정보");
		System.out.println("나이 : "+this.age);
		System.out.println("성별 : "+this.gender);
		System.out.println("전화번호 : "+this.tel);
	}
	// 메소드 (함수)
	void 웃다() {
		System.out.println("웃는다.");
	}
	void 먹다() {
		System.out.println("먹는다.");
	}
}	

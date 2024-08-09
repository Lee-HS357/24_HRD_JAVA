package day04;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SmartPhone객체 생성
		SmartPhone myPhone= new SmartPhone("아이폰","스페이스 그레이");
		//Phone으로 부터 상속받은 필드 읽기
		System.out.println("모델 : "+myPhone.model);
		System.out.println("색상 : "+myPhone.color);
		
		//Phone의 필드 읽기
		System.out.println("와이파이 상태 : "+ myPhone.wifi);
		
		//SmartPhone으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}

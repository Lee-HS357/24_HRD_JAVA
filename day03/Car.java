package day03;

public class Car {
 
	// 필드 선언
	String model;
	String color;
	String company;
	int Speed;
	int rpm;
	
	// 생성자 선언 
	public Car(){
	
	}	
	// 인자 생성자(오버로딩)
	public Car(String company, String model, String color, int i){
		this.company = company;
		this.model = model;
		this.color = color;
		this.Speed = Speed;
	}
	public Car(String company, String model, String color){
		this(company, model, color,200);
	}	
	// 메소드 선언
	void CarInfo() {
		System.out.println("==================");
		System.out.println("제조회사 :"+company);
		System.out.println("모델 :"+model);
		System.out.println("색상:"+color);
		System.out.println("최고 속도"+Speed);
		System.out.println("==================");
	}
}
	

	
	


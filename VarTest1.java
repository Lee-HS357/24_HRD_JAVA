package day01;

public class VarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 변수
		// int
		int x; // 정수 변수 변수 x 선언
		x = 5; // 변수 x 에 5 값 저장 및 초기화
		int y = 8; // 변수 y 를 선언하고 8 값을 저장
		int result = x + y;// 변수 result 를 선언한고 변수 x 와 y 를 더한 값을 저장
		System.out. println(result); // 콘솔에 변수의값을 출력하는 println() 메소드 호출
		
		// 2. 실수 변수
		// float(4byte), double(8byte)
		double height = 155.7;
		float weight =45.5f;
		System.out.println("키 : "+height+"\n"+"몸무계 : "+weight);
		
		// 3. 문자형 변수
		// char
		char blood = 'A';
		System.out.println("혈액형 : "+blood+"형 입니다.");
		
		// 4. 문자열 변수
		// String
		String name = "이현수";
		
		System.out.println("이름 : "+name+"입니다.");
		
		// 5. 논리형 변수
		// boolean
		boolean stop = true;
		if (stop == true) {
			System.out.println("중지합니다.");
			stop = false;	
		}else {
			System.out.println("시작합니다.");
		}
	}
}

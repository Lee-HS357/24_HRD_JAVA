package day03;

public class ArratCreateByValueListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열데이터 4개 를 저장할 배열 선언 및 초기화
		String[] season= {"Spring", "Summer", "Fall", "Winter"};
		for(int n=0; n<4; n++) {
		System.out.println(season[n]);
		}
		season[1]="여름";
		for(int n=0; n<4; n++) {
			System.out.println(season[n]);
			}
		//이름 문자열 3 개를 저장할 배열 선언 및 초기화
		String[] names = null; //참조형 변수의 기본 값 Null
		names = new String[] {"홍길동", "이순신", "유관순"};
		for(int n=0; n<3; n++) {
			System.out.println(names[n]);
			}
	}
}

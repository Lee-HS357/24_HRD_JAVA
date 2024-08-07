package day02;

public class Game2 {

	public static void main(String[] args) {
		// 문제2 : continue문  369게임
		// 1부터 10까지의 정수 출력중 3,6,9 일때 박수 소리 출력하는 프로그램 작성 결과
	       int num = 1;
	        while(num<10) {
	        	num++;	
	        	if(num %3 == 0) {
	        		System.out.print("짝");	 
	        		continue; // 무시        		
	        	}  
	        System.out.print(" "+num+" ");
	        }
	}
}

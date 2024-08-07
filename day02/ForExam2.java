package day02;

public class ForExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기식; 조건식; 증감식){반복수행문}
		// 1에서 100까지의 짝수들의 총합
		int num;
		int hap =0;
		for(num = 0; num<=100; num++){
			if(num%2==0) 
				hap += num;
			}
		System.out.println("1에서 100까지의 짝수들의 총합: " + hap);	
		}
	}

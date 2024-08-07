package day02;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; 
		int sum=0;
		while(i<100) {
			if(i%2 == 0) {
				sum=sum+i;	
			}
			i++;
		}
		System.out.println("1에서 100까지의 짝수들의 총합: " + sum);		
	}
}


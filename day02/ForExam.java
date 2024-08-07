package day02;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기식; 조건식; 증감식){반복수행문}
		int dan;
		for(dan = 2; dan<=9; dan++){
			System.out.println("##"+dan+"단##");
			for(int num = 1; num<=9; num++) {
				System.out.println(dan+"*"+num+"="+(dan*num));
			}
		}
	}
}
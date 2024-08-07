package day02;
import java.util.Scanner;
public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int jumsu;
		jumsu = scan.nextInt();
		if(jumsu>=95) {
			System.out.println("학점은 A+ 입니다.");
		}else if(jumsu>=90){
			System.out.println("학점은 A0 입니다.");
		}else if(jumsu>=85){
			System.out.println("학점은 B+ 입니다.");
		}else if(jumsu>=80){
			System.out.println("학점은 B0 입니다.");
		}else if(jumsu>=75){
			System.out.println("학점은 C+ 입니다.");
		}else if(jumsu>=70){
			System.out.println("학점은 C0 입니다.");
		}else if(jumsu>=65){
			System.out.println("학점은 D+ 입니다.");
		}else if(jumsu>=60){
			System.out.println("학점은 D0 입니다.");
		}else{
			System.out.println("F");
		}
	}
}


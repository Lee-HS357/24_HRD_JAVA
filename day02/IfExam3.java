package day02;
import java.util.Scanner;
public class IfExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scan = new Scanner(System.in);
		System.out.println("##로그인(admain혹은 임의 아이디)##");
		System.out.println("#로그인 아이디 : ");
		String name;
		name = scan.nextLine();
		if( name == "admain") {
			System.out.println("관리자로 로그인");
		}else {
			System.out.println(name+"로그인!");
		}
		System.out.println("##메뉴 선택 하세요(1~2)##");
		System.out.println("#메뉴 선택 : ");
		int num;
		num = scan.nextInt();
		if(num == 1) {
			System.out.println(name+" 1번을 선택함!!");	
		}else {
			System.out.println(name+" 2번을 선택함!!");
		}
	}
}



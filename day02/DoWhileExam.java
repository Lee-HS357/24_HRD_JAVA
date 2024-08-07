package day02;

import java.util.Scanner;

public class DoWhileExam {

    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 'q'를 입력하세요.");
        System.out.print("> ");
        Scanner scan = new Scanner(System.in);
        String text = "";
        
        do {
            text = scan.nextLine();
            if (!text.equals("q")) {  
                System.out.println("> "+text);
            }
        } while (!text.equals("q")); 
        System.out.println("프로그램 종료");
    }
}




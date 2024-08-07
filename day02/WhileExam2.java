package day02;

import java.util.Scanner;

public class WhileExam2 {

    public static void main(String[] args) {
        /**
         * 1. 증속 |2. 감속 |3. 중지
         */
        Scanner scan = new Scanner(System.in);
        int speed = 0;
        boolean run = true;
        
        while (run) {
            System.out.println("------------------------");
            System.out.println("1. 증속 |2. 감속 |3. 중지");
            System.out.println("------------------------");
            String num = scan.nextLine();
            
            if (num.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (num.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (num.equals("3")) {
                run = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }       
        System.out.println("프로그램 종료");
    }
}



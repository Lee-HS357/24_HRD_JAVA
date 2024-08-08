package day03;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[3];
        
        while (true) {
            // 메뉴 출력
            System.out.println("--------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수리스트 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------");
            
            // 사용자 선택 입력 받기
            System.out.print("선택 > ");
            int select = scan.nextInt();
            
            if (select == 1) {
                System.out.println("학생수 > ");
                int numberOfStudents = scan.nextInt();
              // 점수 입력 받기     
            } else if (select == 2) {
                System.out.println("점수를 입력하세요:");
                System.out.print("scores[0] > ");
                scores[0] = scan.nextInt();
                System.out.print("scores[1] > ");
                scores[1] = scan.nextInt();
                System.out.print("scores[2] > ");
                scores[2] = scan.nextInt();
              // 점수 확인  
            } else if (select == 3) {
                System.out.println("점수 리스트:");
                System.out.println("scores[0] = " + scores[0]);
                System.out.println("scores[1] = " + scores[1]);
                System.out.println("scores[2] = " + scores[2]);
              // 분석  
            } else if (select == 4) {
            	int sum = 0;
                int maxScore = scores[0];                
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > maxScore) {
                        maxScore = scores[i];
                    }
                    sum += scores[i];
                }              
                double average = (double) sum / scores.length;                
                System.out.println("최고 점수: " + maxScore);
                System.out.println("평균 점수: " + average);
              // 루프 종료
            } else if (select == 5) {
            	System.out.println("종료");
            	break; 
                
            } 
  
        }
        
    }
}


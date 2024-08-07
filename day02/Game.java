/*package day02;

import java.util.Random;
import java.util.Scanner;

public class RandomExam2 {

    public static void main(String[] args) {
        // 가위 바위 보 게임 만들기
        // 1~3까지의 난수를 생성하여 1: 가위, 2: 바위, 3: 보, 0: 종료
        // 컴퓨터와 유저간 게임을 하여 승패를 출력합니다.
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        while (true) {
            // 사용자 입력 받기
            System.out.println("숫자를 입력하세요 (1: 가위, 2: 바위, 3: 보, 0: 종료) : ");
            int userChoice = scan.nextInt();
            
            // 종료 조건
            if (userChoice == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            // 1~3 사이의 임의의 수 생성 (컴퓨터의 선택)
            int computerChoice = random.nextInt(3) + 1;

            // 결과 출력
            if (userChoice == computerChoice) {
                System.out.println("무승부입니다.");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("승리하셨습니다.");
            } else {
                System.out.println("패배하셨습니다.");
            }
        }

        scan.close(); // Scanner 객체 닫기
    }
}*/
package day02;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // 가위 바위 보 게임 만들기
        // 1~3까지의 난수를 생성하여 1: 가위, 2: 바위, 3: 보, 0: 종료
        // 컴퓨터와 유저 간 게임을 하여 승패를 출력합니다.

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        while (true) {
            // 사용자 입력 받기
            System.out.println("숫자를 입력하세요 (1: 가위, 2: 바위, 3: 보, 0: 종료) : ");
            int num = scan.nextInt();

            // 종료 조건
            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            // 1~3 사이의 임의의 수 생성 (컴퓨터의 선택)
            int num2 = random.nextInt(3) + 1;

            // 결과 출력
            if (num == 1 && num2 == 3) {
                System.out.println("승리하셨습니다.");
            } else if (num == 1 && num2 == 2) {
                System.out.println("패배하셨습니다.");
            } else if (num == 1 && num2 == 1) {
                System.out.println("무승부하셨습니다.");
            } else if (num == 2 && num2 == 1) {
                System.out.println("승리하셨습니다.");
            } else if (num == 2 && num2 == 2) {
                System.out.println("무승부하셨습니다.");
            } else if (num == 2 && num2 == 3) {
                System.out.println("패배하셨습니다.");
            } else if (num == 3 && num2 == 1) {
                System.out.println("패배하셨습니다.");
            } else if (num == 3 && num2 == 2) {
                System.out.println("승리하셨습니다.");
            } else if (num == 3 && num2 == 3) {
                System.out.println("무승부하셨습니다.");
            }
        }

        scan.close(); // Scanner 객체 닫기
    }
}
